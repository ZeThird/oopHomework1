package practice;

import practice.impl.HotDrink;
import practice.impl.HotDrinkVM;

import java.time.LocalDate;

public class ProductMain {

    public static void main(String[] args) {
        HotDrink hotDrink1 = new HotDrink("milk drink", 10f, LocalDate.of(2005, 9, 3), 55.366f);
        HotDrink hotDrink2 = new HotDrink("choco drink", 10f, LocalDate.of(2025, 9, 5), 88.531f); 
        HotDrink hotDrink3 = new HotDrink("coconut drink", 20f, LocalDate.of(2023, 5, 9), 62.371f);
        HotDrink hotDrink4 = new HotDrink("watermelon drink", 5f, LocalDate.of(2015, 4, 8), 99.103f);

        HotDrinkVM vendingMachine1 = new HotDrinkVM();
        vendingMachine1.addProduct(hotDrink1);
        vendingMachine1.addProduct(hotDrink2);


        HotDrinkVM vendingMachine2 = new HotDrinkVM();
        vendingMachine2.addProduct(hotDrink3);
        vendingMachine2.addProduct(hotDrink4);

        System.out.printf("hotDrink2: %s\n", hotDrink2.toString());

        HotDrink foundProduct = vendingMachine1.getProduct("milk drink", 1f, 55.366f);
        if (foundProduct != null) {            
            System.out.printf("Found product in first vending machine: %s\n", foundProduct.toString());
        }

     
        HotDrink foundProduct2 = vendingMachine2.getProduct("watermelon drink", 1f, 99.103f);
        if (foundProduct2 != null) {
            System.out.printf("Found product in second vending machine: %s\n", foundProduct2.toString());
        }
    
    }
}
