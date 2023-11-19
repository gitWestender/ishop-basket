package com.javalearning.basket.models;

public class Basket {
    private final int productID;

    public Basket(int productID) {
        this.productID = productID;
    }

    public Integer getProductID() {
        return productID;
    }
}
