package org.example.proyecto.clases;

import java.time.LocalDate;

public class productReview {
    private int productReviewId;
    private int productId;
    private String reviewerName;
    private LocalDate reviewDate;
    private String emailAdress;
    private int raiting;
    private String coments;
    private LocalDate modifiedDate;

    public productReview(int productReviewId, int productId, String reviewerName, LocalDate reviewDate,
            String emailAdress, int raiting, String coments, LocalDate modifiedDate) {
        this.productReviewId = productReviewId;
        this.productId = productId;
        this.reviewerName = reviewerName;
        this.reviewDate = reviewDate;
        this.emailAdress = emailAdress;
        this.raiting = raiting;
        this.coments = coments;
        this.modifiedDate = modifiedDate;
    }

    public int getProductReviewId() {
        return productReviewId;
    }

    public void setProductReviewId(int productReviewId) {
        this.productReviewId = productReviewId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    public String getComents() {
        return coments;
    }

    public void setComents(String coments) {
        this.coments = coments;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}
