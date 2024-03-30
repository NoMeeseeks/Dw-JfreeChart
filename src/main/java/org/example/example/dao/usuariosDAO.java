package org.example.example.dao;

import org.example.example.controller.usuariosController;
import org.example.example.controller.usuariosXsueldo;
import org.example.conexcion.conexcionDB;

import java.sql.*;
import java.util.ArrayList;

public class usuariosDAO {

    // primer ejemplo
    public ArrayList<usuariosXsueldo> obtenerUsuariosPorSueldo() {

        ArrayList<usuariosXsueldo> listaUsuariosXSueldo = new ArrayList<>();

        // se realiza la conexcion a la base de datos y si es verdadero se ejecuta el
        // try
        try (
                Connection con = conexcionDB.obtenerConexcion();
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery(
                        "select count(u.idusuario)as cantidad,u.sueldo  from usuarios u group by u.sueldo ;")) {
            while (rs.next()) {
                int cantidad = rs.getInt("cantidad");
                int sueldo = rs.getInt("sueldo");

                usuariosXsueldo objUsuariosXSueldo = new usuariosXsueldo(cantidad, sueldo);
                listaUsuariosXSueldo.add(objUsuariosXSueldo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaUsuariosXSueldo;
    }

    // segundo ejemplo
}
