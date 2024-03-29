package org.example.example.controller;

public class usuariosXsueldo {
    private int cantidad;
    private int sueldo;

    public usuariosXsueldo(int cantidad, int sueldo) {
        this.cantidad = cantidad;
        this.sueldo = sueldo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
