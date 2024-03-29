package org.example.controller;

public class ventasXrango {
    private int cantidad;
    private int month;
    public ventasXrango(){

    }

    public ventasXrango(int cantidad, int month) {
        this.cantidad = cantidad;
        this.month = month;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
