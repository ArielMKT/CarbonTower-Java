import org.jetbrains.exposed.sql.Database

object Connection{

    fun connectWithSqlServer(
        server: String,
        databaseName: String,
        databaseUser: String,
        databasePassword: String
    ){
        Database.connect(
            url = "jdbc:sqlserver://${server};databaseName=${databaseName}",
            driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver",
            user = databaseUser,
            password = databasePassword
        )
    }

    fun connectWithCarbonTowerDatabase(){
        connectWithSqlServer(
            server = "servercarbontower.database.windows.net",
            databaseName = "carbontower",
            databaseUser = "tower",
            databasePassword = "!Carbon6"
        )
    }

}