package com.mycompany.oopsconcept;

public class ElectronicsItem extends Item {
    public ElectronicsItem(String productName, double productPrice, int quantity) {
        super(productName, productPrice, "Electronics", quantity);
    }

    @Override
    public double getItemTotal() {
        return getQuantity() * getProductPrice();
    }
}

