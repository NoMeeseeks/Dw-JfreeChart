package org.example.proyecto.clases;

public class ProductInfo {
    private int ProductInfoId;
    private int productId;
    private int productReviewId;
    private int locationId;
    private int timeId;
    private int quantity;
    private int cost;
    private int salePrice;

    public ProductInfo(int productInfoId, int productId, int productReviewId, int locationId, int timeId, int quantity,
            int cost, int salePrice) {
        ProductInfoId = productInfoId;
        this.productId = productId;
        this.productReviewId = productReviewId;
        this.locationId = locationId;
        this.timeId = timeId;
        this.quantity = quantity;
        this.cost = cost;
        this.salePrice = salePrice;
    }

    public int getProductInfoId() {
        return ProductInfoId;
    }

    public void setProductInfoId(int productInfoId) {
        ProductInfoId = productInfoId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductReviewId() {
        return productReviewId;
    }

    public void setProductReviewId(int productReviewId) {
        this.productReviewId = productReviewId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

}
