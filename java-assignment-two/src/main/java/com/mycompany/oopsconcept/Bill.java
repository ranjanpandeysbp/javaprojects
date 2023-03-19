package com.mycompany.oopsconcept;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    private List<Item> items = new ArrayList<>();
    private double totalAmount;
    private double discountedAmount;

    public void addItem(Item item) {
        items.add(item);
    }

    public void applyDiscount(int totalQuantity) {
        double discountPercentage = 0.0;

        if (totalQuantity >= 10) {
            discountPercentage = 0.1;
        } else if (totalQuantity >= 5) {
            discountPercentage = 0.05;
        }

        double total = 0.0;

        for (Item item : items) {
            total += item.getProductPrice() * item.getQuantity();
        }

        totalAmount = total;

        double discountAmount = total * discountPercentage;
        discountedAmount = total - discountAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getDiscountedAmount() {
        return discountedAmount;
    }
}
