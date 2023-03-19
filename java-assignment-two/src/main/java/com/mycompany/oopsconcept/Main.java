package com.mycompany.oopsconcept;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bill bill = new Bill();

        System.out.println("Welcome to the store!");
        System.out.println("Please enter the number of items you want to purchase:");

        int totalQuantity = scanner.nextInt();

        for (int i = 0; i < totalQuantity; i++) {
            System.out.println("Enter product name:");
            String productName = scanner.next();

            System.out.println("Enter product price:");
            double productPrice = scanner.nextDouble();

            System.out.println("Enter product category:");
            String productCategory = scanner.next();

            System.out.println("Enter quantity:");
            int quantity = scanner.nextInt();

            Item item = null;

            switch (productCategory) {
                case "Electronics":
                    item = new ElectronicsItem(productName, productPrice, quantity);
                    break;
                case "Clothing":
                    item = new ClothingItem(productName, productPrice, quantity);
                    break;
                case "Food":
                    item = new FoodItem(productName, productPrice, quantity);
                    break;
                default:
                    System.out.println("Invalid product category");
                    break;
            }

            if (item != null) {
                bill.addItem(item);
            }
        }

        bill.applyDiscount(totalQuantity);

        System.out.println("Total amount: " + bill.getTotalAmount());
        System.out.println("Discounted amount: " + bill.getDiscountedAmount());
    }
}

