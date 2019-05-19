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
            println(body.tempCpu)
            println(body.tempGpu)
            println(body.useGpu)
            transaction {
                T_MACHINE_METRIC.insert {
                    it[useRam] = body.memoryRam
                    it[tempCPU] = body.tempCpu
                    it[tempGPU] = body.tempGpu
                    it[useGPU] = body.useGpu
                }
            }
            ctx.status(200).json("Cadastro realizado com sucesso")
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
                }.count() == 0) {
                    ctx.status(401).json("Usuário não autorizado!")
                    return@transaction
                }

                ctx.status(200).json("Logado com sucesso!")

            }

        }
    }
}

fun main(){
    TesteHttp.startServer()
}