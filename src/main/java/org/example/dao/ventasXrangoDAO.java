package org.example.dao;

import org.example.conexcion.conexcionDB;
import org.example.controller.Usuario;
import org.example.controller.ventasXrango;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ventasXrangoDAO {
    public List<ventasXrango> obtenerRango() {
        List<ventasXrango> ventasss = new ArrayList<>();
        try (Connection con = conexcionDB.obtenerConexcion();
             PreparedStatement statement = con.prepareCall("execute ObtenerVentasEnRangoDeMeses2;");
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                int cantidad = rs.getInt("cantidad");
                int meses = rs.getInt("month");

                ventasXrango usuario = new ventasXrango(cantidad, meses);
                ventasss.add(usuario);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return ventasss;
    }
}
