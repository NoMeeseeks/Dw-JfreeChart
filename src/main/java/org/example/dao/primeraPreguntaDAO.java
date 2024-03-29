package org.example.dao;

import org.example.conexcion.conexcionDB;
import org.example.controller.pregunta1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class primeraPreguntaDAO {
    public List<pregunta1> obtenerPregunta1() {

        List<pregunta1> listaPregunta1 = new ArrayList<>();
        try (Connection con = conexcionDB.obtenerConexcion();
             PreparedStatement statement = con.prepareCall("execute ObtenerVentasPorEmpleadoYAnioOriginalMayor10000enel72;");
             ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("empleadoID");
                int anio = rs.getInt("year");
                int cantidad = rs.getInt("cantidad");

                pregunta1 pregunta1obj = new pregunta1(id,anio,cantidad);
                listaPregunta1.add(pregunta1obj);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return listaPregunta1;
    }
}
