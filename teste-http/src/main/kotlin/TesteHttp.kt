import io.javalin.Javalin
import org.jetbrains.exposed.sql.and
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.transactions.transaction

object TesteHttp{

    fun startServer(){
        Connection.connectWithCarbonTowerDatabase()

        val javalin = Javalin.create().start(7000)
        javalin.get("") {ctx -> ctx.result("hello world") }
        javalin.post("oshi") {ctx ->

            val body = ctx.body<Oshi>()

            println(body.memoryRam)

            transaction {
                T_MACHINE_METRIC.insert {
                    it[useRam] = body.memoryRam
                    it[tempCPU] = body.tempCpu
                }
            }
            ctx.status(200).result(" OK")
        }
        javalin.post("login"){ctx ->

            val body = ctx.body<Login>()

            println("${body.login}${body.password}")

            transaction {
                if(T_USER.select{
                    T_USER.idUser
                        .eq(body.login)
                        .and(T_USER.userPassword
                            .eq(body.password))
                }.count() != 0) {
                    ctx.status(200)
                    return@transaction ;
                }

                ctx.status(404)

            }

        }
    }
}

fun main(){
    TesteHttp.startServer()
}