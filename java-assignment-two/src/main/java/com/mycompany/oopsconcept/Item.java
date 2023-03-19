package com.mycompany.oopsconcept;

public abstract class Item implements Product {
    private final String productName;
    private final double productPrice;
    private final String productType;
    private int quantity;

    public Item(String productName, double productPrice, String productType, int quantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productType = productType;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String getProductType() {
        return productType;
    }

    public abstract double getItemTotal();
}

