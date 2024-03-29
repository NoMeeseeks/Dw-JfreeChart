package org.example.conexcion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexcionDB {
    public static final String url =
            "jdbc:sqlserver://localhost\\XAVIERPC/SQLEXPRESS:1433;databaseName=VentasDataMart;instance=SQLEXPRESS;encrypt=false;trustServerCertificate=true;";
    public static final String user="sa";
    public static final String pass="12345";

    public static Connection con;
    public static Connection obtenerConexcion(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //conexcion a la base
            con = DriverManager.getConnection(url,user,pass);
        } catch (SQLException | ClassNotFoundException e){
            System.err.println(e.getMessage());
        }
        return con;
    }
}
