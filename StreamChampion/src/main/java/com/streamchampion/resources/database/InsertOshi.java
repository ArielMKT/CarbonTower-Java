package com.streamchampion.resources.database;

import com.streamchampion.domain.Loggable;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertOshi {

    Connection connection = new Connection();
    java.sql.Connection conn = connection.getConnection();

    public void insertOshi(String useRam, String rpmCooler, String tempCpu){

        rpmCooler = rpmCooler.replace("[", "");
        rpmCooler = rpmCooler.replace("]", "");

        try {
            String SQL = "INSERT INTO T_MACHINE_METRIC (useRam, rpmCooler, tempCPU) values ('" + useRam + "', '" +
                rpmCooler + "', '" + tempCpu + "');";
            Statement statement = conn.createStatement();
            statement.executeUpdate(SQL);

            statement.close();
        }catch(SQLException e){
            new Loggable().createLogs(e.toString(), "Logs/", "Log");
            System.out.println(e);
        }
    }

}
