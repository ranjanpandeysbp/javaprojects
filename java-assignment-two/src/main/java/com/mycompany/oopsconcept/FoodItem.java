package com.mycompany.oopsconcept;

public class FoodItem extends Item {
    public FoodItem(String productName, double productPrice, int quantity) {
        super(productName, productPrice, "Food", quantity);
    }

    @Override
    public double getItemTotal() {
        return getQuantity() * getProductPrice();
    }
}

