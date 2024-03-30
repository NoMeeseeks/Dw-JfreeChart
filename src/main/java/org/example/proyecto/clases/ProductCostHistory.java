package org.example.proyecto.clases;

import java.time.LocalDate;

public class ProductCostHistory {
    private int productId;
    private LocalDate startDate;
    private LocalDate endDate;
    private int standarCost;
    private LocalDate modifiedDate;

    public ProductCostHistory(int productId, LocalDate startDate, LocalDate endDate, int standarCost,
            LocalDate modifiedDate) {
        this.productId = productId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.standarCost = standarCost;
        this.modifiedDate = modifiedDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getStandarCost() {
        return standarCost;
    }

    public void setStandarCost(int standarCost) {
        this.standarCost = standarCost;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}
