package com.ekstedt;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();
    private String strategy = "name";

    public void addProducts(Product product) {
        this.products.add(product);
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public void sortProducts() {
        Comparator<Product> comparator;
        switch (strategy) {
            case "price" : comparator = new PriceComparator();
            break;
            case "stock" : comparator = new StockComparator();
            break;
            default:comparator = new NameComparator();
        }
        products.sort(comparator);
    }
    public void printProducts() {
        for(Product product : products){
            System.out.println(product.getName() + " " + product.getPrice() + " " + product.getStock());
        }
    }
}
