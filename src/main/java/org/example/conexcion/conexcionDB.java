package org.example.conexcion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexcionDB {
    public static final String url = "";
    public static final String user = "";
    public static final String pass = "";

    public static Connection con;

    public static Connection obtenerConexcion() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // conexcion a la base
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return con;
    }
}
