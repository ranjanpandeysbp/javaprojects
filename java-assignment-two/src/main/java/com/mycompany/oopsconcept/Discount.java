package com.mycompany.oopsconcept;

public enum Discount {
    FIVE_PERCENT(0.05),
    TEN_PERCENT(0.1),
    FIFTEEN_PERCENT(0.15);

    private final double discountRate;

    private Discount(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}

