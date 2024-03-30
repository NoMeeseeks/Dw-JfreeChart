package org.example.proyecto.clases;

import java.time.LocalDate;

public class ProductInventory {
    private int productId;
    private int locationId;
    private String shelf;
    private int bin;
    private int quantity;
    private int rowguid;
    private LocalDate modifiedDate;

    // variables aparte
    private String nombreProducto;

    public ProductInventory(int quantity, String nombreProducto) {
        this.quantity = quantity;
        this.nombreProducto = nombreProducto;
    }

    public ProductInventory(int productId, int locationId, String shelf, int bin, int quantity, int rowguid,
            LocalDate modifiedDate) {
        this.productId = productId;
        this.locationId = locationId;
        this.shelf = shelf;
        this.bin = bin;
        this.quantity = quantity;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public int getBin() {
        return bin;
    }

    public void setBin(int bin) {
        this.bin = bin;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRowguid() {
        return rowguid;
    }

    public void setRowguid(int rowguid) {
        this.rowguid = rowguid;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    // variable aparte
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
}
