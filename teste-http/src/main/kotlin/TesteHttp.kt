import io.javalin.Javalin
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction

object TesteHttp{

    fun startServer(){
        Connection.connectWithCarbonTowerDatabase()

        val javalin = Javalin.create().start(7000)
        javalin.get("") {ctx -> ctx.result("hello world") }
        javalin.post("test") {ctx ->

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
    }
}

fun main(){
    TesteHttp.startServer()
}