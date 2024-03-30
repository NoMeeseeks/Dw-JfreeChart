package org.example.proyecto.clases;

public class productReview {
    private int productReviewId;
    private int productId;
    private int reviewerName;
    private int reviewDate;
    private int emailAdress;
    private int raiting;
    private int coments;
    private int modifiedDate;

    public productReview(int productReviewId, int productId, int reviewerName, int reviewDate, int emailAdress,
            int raiting, int coments, int modifiedDate) {
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

    public int getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(int reviewerName) {
        this.reviewerName = reviewerName;
    }

    public int getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(int reviewDate) {
        this.reviewDate = reviewDate;
    }

    public int getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(int emailAdress) {
        this.emailAdress = emailAdress;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    public int getComents() {
        return coments;
    }

    public void setComents(int coments) {
        this.coments = coments;
    }

    public int getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(int modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}
