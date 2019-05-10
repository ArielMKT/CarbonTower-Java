package com.streamchampion.resources.database;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

    private String hostName = "servercarbontower.database.windows.net";
    private String dbName = "carbontower";
    private String username = "tower";
    private String password = "!Carbon6";
    private String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
            + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, username, password);
    private java.sql.Connection connection = null;

    public java.sql.Connection getConnection(){
        try{
            connection = DriverManager.getConnection(url);
            String schema = connection.getSchema();
            System.out.println("Successful connection - Schema: " + schema);

            return connection;

        }catch(SQLException e){
            System.out.println(e);
        }

        return connection;
    }





}
