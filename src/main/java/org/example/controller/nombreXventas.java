package org.example.controller;

public class nombreXventas {
    private String nombre;
    private int cantidad_ventas;
    public nombreXventas(){

    }

    public nombreXventas(String nombre, int cantidad_ventas) {
        this.nombre = nombre;
        this.cantidad_ventas = cantidad_ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad_ventas() {
        return cantidad_ventas;
    }

    public void setCantidad_ventas(int cantidad_ventas) {
        this.cantidad_ventas = cantidad_ventas;
    }
}
