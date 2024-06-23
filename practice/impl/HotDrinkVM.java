package practice.impl;

import practice.Product;
import practice.VendingMachine;

import java.util.List;


public class HotDrinkVM extends VendingMachine {

    public HotDrinkVM() {
        super();
    }

    public HotDrinkVM(List<Product> products) {
        super(products);
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public HotDrink getProduct(String name, float volume, float temperature) {
        for (Product product : products) {
            if (product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink)product; 
                if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                    return hotDrink;
                }
            }
        }
        return null;
    }
    
    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }
}
