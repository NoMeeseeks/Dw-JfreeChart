package org.example.controller;

public class HechoVentas {
    private int productoID;
    private int clienteID;
    private int empleadoID;
    private int tiempoID;
    private int precio;
    private int cantidad;
    public HechoVentas(){

    }

    public int getProductoID() {
        return productoID;
    }

    public void setProductoID(int productoID) {
        this.productoID = productoID;
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoID = empleadoID;
    }

    public int getTiempoID() {
        return tiempoID;
    }

    public void setTiempoID(int tiempoID) {
        this.tiempoID = tiempoID;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
