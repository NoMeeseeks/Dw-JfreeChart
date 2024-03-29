package org.example.controller;

public class pregunta1 {
    private int empleadoID;
    private int year;
    private int cantidad;
    public pregunta1(){

    }
    public pregunta1(int empleadoID, int year, int cantidad) {
        this.empleadoID = empleadoID;
        this.year = year;
        this.cantidad = cantidad;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoID = empleadoID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
