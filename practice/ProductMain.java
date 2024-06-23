package practice;

import practice.impl.HotDrink;
import practice.impl.HotDrinkVM;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        HotDrink hotDrink1 = new HotDrink("milk drink", 10f, LocalDate.of(2005, 9, 3), 55.366f);
        HotDrink hotDrink2 = new HotDrink("choco drink", 10f, LocalDate.of(2025, 9, 5), 88.531f);
        
        HotDrinkVM vendingMachine = new HotDrinkVM();
        List<Product> products = new ArrayList<Product>();
        products.add(hotDrink1);
        products.add(hotDrink2);

        vendingMachine.addProducts(products);

        System.out.printf("hotDrink2: %s\n", hotDrink2.toString());
        HotDrink foundProduct = vendingMachine.getProduct("milk drink", 1f, 55.366f);
        if (foundProduct != null) {
            System.out.printf("Found product: %s\n", foundProduct.toString());
        }
    }
}
