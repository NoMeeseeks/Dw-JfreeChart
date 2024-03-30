package org.example.proyecto.clases;

import java.time.LocalDate;

public class Product {
    private int productID;
    private String name;
    private String productNumber;
    private char makeFlag;
    private char finishedGoodsFlag;
    private String color;
    private int safetyStockLevel;
    private int reorderPoint;
    private int standardCost;
    private int listPrice;
    private String size;
    private float weight;
    private int daysToManufacture;
    private String productLine;
    private String clas;
    private String style;
    private LocalDate sellStartDate;
    private LocalDate sellEndDate;
    private LocalDate discontinuedDate;
    private String rowguid;
    private LocalDate modifiedDate;

    public Product(int productID, String name, String productNumber, char makeFlag, char finishedGoodsFlag,
            String color, int safetyStockLevel, int reorderPoint, int standardCost, int listPrice, String size,
            float weight, int daysToManufacture, String productLine, String clas, String style, LocalDate sellStartDate,
            LocalDate sellEndDate, LocalDate discontinuedDate, String rowguid, LocalDate modifiedDate) {
        this.productID = productID;
        this.name = name;
        this.productNumber = productNumber;
        this.makeFlag = makeFlag;
        this.finishedGoodsFlag = finishedGoodsFlag;
        this.color = color;
        this.safetyStockLevel = safetyStockLevel;
        this.reorderPoint = reorderPoint;
        this.standardCost = standardCost;
        this.listPrice = listPrice;
        this.size = size;
        this.weight = weight;
        this.daysToManufacture = daysToManufacture;
        this.productLine = productLine;
        this.clas = clas;
        this.style = style;
        this.sellStartDate = sellStartDate;
        this.sellEndDate = sellEndDate;
        this.discontinuedDate = discontinuedDate;
        this.rowguid = rowguid;
        this.modifiedDate = modifiedDate;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public char getMakeFlag() {
        return makeFlag;
    }

    public void setMakeFlag(char makeFlag) {
        this.makeFlag = makeFlag;
    }

    public char getFinishedGoodsFlag() {
        return finishedGoodsFlag;
    }

    public void setFinishedGoodsFlag(char finishedGoodsFlag) {
        this.finishedGoodsFlag = finishedGoodsFlag;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSafetyStockLevel() {
        return safetyStockLevel;
    }

    public void setSafetyStockLevel(int safetyStockLevel) {
        this.safetyStockLevel = safetyStockLevel;
    }

    public int getReorderPoint() {
        return reorderPoint;
    }

    public void setReorderPoint(int reorderPoint) {
        this.reorderPoint = reorderPoint;
    }

    public int getStandardCost() {
        return standardCost;
    }

    public void setStandardCost(int standardCost) {
        this.standardCost = standardCost;
    }

    public int getListPrice() {
        return listPrice;
    }

    public void setListPrice(int listPrice) {
        this.listPrice = listPrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getDaysToManufacture() {
        return daysToManufacture;
    }

    public void setDaysToManufacture(int daysToManufacture) {
        this.daysToManufacture = daysToManufacture;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public LocalDate getSellStartDate() {
        return sellStartDate;
    }

    public void setSellStartDate(LocalDate sellStartDate) {
        this.sellStartDate = sellStartDate;
    }

    public LocalDate getSellEndDate() {
        return sellEndDate;
    }

    public void setSellEndDate(LocalDate sellEndDate) {
        this.sellEndDate = sellEndDate;
    }

    public LocalDate getDiscontinuedDate() {
        return discontinuedDate;
    }

    public void setDiscontinuedDate(LocalDate discontinuedDate) {
        this.discontinuedDate = discontinuedDate;
    }

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}
