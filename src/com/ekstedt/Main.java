package com.ekstedt;

public class Main {
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        productManager.addProducts(new Product("Iphone", 15000, 11));
        productManager.addProducts(new Product("Samsung", 11000, 13));
        productManager.addProducts(new Product("Google", 8000, 20));
        productManager.addProducts(new Product("Sony", 7000, 21));

        System.out.println("---Sort by name ---");
        productManager.setStrategy("name");
        productManager.sortProducts();
        productManager.printProducts();

        System.out.println("---Sort by price ---");
        productManager.setStrategy("price");
        productManager.sortProducts();
        productManager.printProducts();

        System.out.println("---Sort by stock ---");
        productManager.setStrategy("stock");
        productManager.sortProducts();
        productManager.printProducts();
    }
}