package com.ekstedt;

import java.util.Comparator;

public class StockComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return product1.getStock() - product2.getStock();
    }
}
