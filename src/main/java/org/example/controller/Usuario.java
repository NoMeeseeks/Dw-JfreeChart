package org.example.controller;

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String genero;
    private int cantidad;
    public Usuario(String genero, int cantidad){
        this.genero=genero;
        this.cantidad=cantidad;
    }
    public Usuario(int id, String nombre, String apellido, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
