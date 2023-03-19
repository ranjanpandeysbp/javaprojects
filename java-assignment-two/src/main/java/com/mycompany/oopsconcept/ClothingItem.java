package com.mycompany.oopsconcept;

public class ClothingItem extends Item {
    public ClothingItem(String productName, double productPrice, int quantity) {
        super(productName, productPrice, "Clothing", quantity);
    }

    @Override
    public double getItemTotal() {
        return getQuantity() * getProductPrice();
    }
}

