package org.example.conexcion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexcionDBPostGres {
    public static String url = "jdbc:postgresql://localhost:5432/practicasql";
    public static final String user="postgres";
    public static final String pass = "xavi12345";
    public static Connection obtenerConexcionPostgres(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            return con;
        } catch (SQLException | ClassNotFoundException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
}
