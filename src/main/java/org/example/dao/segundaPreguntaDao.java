package org.example.dao;

import org.example.conexcion.conexcionDB;
import org.example.controller.nombreXventas;
import org.example.controller.pregunta1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class segundaPreguntaDao {
    public List<nombreXventas> obtenerPregunta2() {

        List<nombreXventas> lista = new ArrayList<nombreXventas>();
        try (Connection con = conexcionDB.obtenerConexcion();
             PreparedStatement statement = con.prepareCall("execute ObtenerCantidadVentasPorCliente;");
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                int cantidad = rs.getInt("cantidad_ventas");

                nombreXventas nvOBJ = new nombreXventas(nombre,cantidad);
                lista.add(nvOBJ);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }
}
