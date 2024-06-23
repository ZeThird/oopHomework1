package practice.impl;

import practice.Product;

import java.time.LocalDate;

public class HotDrink extends Product {
    private float volume;
    private float temperature;

    public HotDrink(String name, double price, LocalDate releaseDate, float temperature) {
        super(name, price, releaseDate); 
        this.temperature = temperature;
        this.volume = 1;
    }
    
    public float getTemperature() {
        return temperature;
    }

    public float getVolume() {
        return volume;
    }
    
    @Override
    public String toString() {
        return "HotDrink{" +
            "name='" + name + "'" +
            ", price=" + price +
            ", releaseDate=" + releaseDate +
            ", volume=" + volume +
            ", temperature=" + temperature +
            "}";
    }
}

