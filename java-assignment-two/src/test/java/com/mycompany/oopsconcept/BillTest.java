package com.mycompany.oopsconcept;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;

public class BillTest {

    @Test
    public void testAddItem() {
        Bill bill = new Bill();

        ElectronicsItem electronicsItem = new ElectronicsItem("Laptop", 1000, 2);
        ClothingItem clothingItem = new ClothingItem("T-shirt", 25, 3);

        bill.addItem(electronicsItem);
        bill.addItem(clothingItem);

        Assert.assertEquals(bill.getItems(), Arrays.asList(electronicsItem, clothingItem));
    }

    @Test
    public void testApplyDiscount_NoDiscount() {
        Bill bill = new Bill();

        ElectronicsItem electronicsItem = new ElectronicsItem("Laptop", 1000, 2);
        ClothingItem clothingItem = new ClothingItem("T-shirt", 25, 3);

        bill.addItem(electronicsItem);
        bill.addItem(clothingItem);

        bill.applyDiscount(4);

        Assert.assertEquals(bill.getTotalAmount(), 2050.0);
        Assert.assertEquals(bill.getDiscountedAmount(), 2050.0);
    }

    @Test
    public void testApplyDiscount_FivePercentDiscount() {
        Bill bill = new Bill();

        ElectronicsItem electronicsItem = new ElectronicsItem("Laptop", 1000, 2);
        ClothingItem clothingItem = new ClothingItem("T-shirt", 25, 3);

        bill.addItem(electronicsItem);
        bill.addItem(clothingItem);

        bill.applyDiscount(5);

        Assert.assertEquals(bill.getTotalAmount(), 2050.0);
        Assert.assertEquals(bill.getDiscountedAmount(), 1947.5);
    }

    @Test
    public void testApplyDiscount_TenPercentDiscount() {
        Bill bill = new Bill();

        ElectronicsItem electronicsItem = new ElectronicsItem("Laptop", 1000, 2);
        ClothingItem clothingItem = new ClothingItem("T-shirt", 25, 3);

        bill.addItem(electronicsItem);
        bill.addItem(clothingItem);

        bill.applyDiscount(10);

        Assert.assertEquals(bill.getTotalAmount(), 2050.0);
        Assert.assertEquals(bill.getDiscountedAmount(), 1845.0);
    }
}

