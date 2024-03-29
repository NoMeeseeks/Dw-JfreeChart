package org.example.dao;

import org.example.controller.Usuario;
import org.example.conexcion.conexcionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class usuariosDAO extends conexcionDB{
    public List<Usuario> obtenerUsuarios(){
        List<Usuario> listaUsuarios=new ArrayList<>();
        try(Connection con= conexcionDB.obtenerConexcion();
                PreparedStatement statement=con.prepareStatement("select * from usuarios");
            ResultSet rs=statement.executeQuery()){

            while (rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String genero = rs.getString("genero");

                Usuario usuario=new Usuario(id,nombre,apellido,genero);
                listaUsuarios.add(usuario);
            }
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return listaUsuarios;
    }

    public List<Usuario> obtenerUsuariosXGenero() {
        List<Usuario> usuariosXgenero = new ArrayList<>();
        try (Connection con = conexcionDB.obtenerConexcion();
             PreparedStatement statement = con.prepareCall("execute obtenerXusuariosXgenero;");
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                int cantidad = rs.getInt("GeneroUsuarios");
                String genero = rs.getString("genero");

                Usuario usuario = new Usuario(genero, cantidad);
                usuariosXgenero.add(usuario);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return usuariosXgenero;
    }
}
