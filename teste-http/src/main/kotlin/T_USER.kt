import org.jetbrains.exposed.sql.Table

object T_USER: Table() {
    val idUser = varchar("idUser", length = 14).primaryKey()
    val userPassword = varchar("userPassword", length = 120)
    val nmUser = varchar("nmUser", length = 60)

}