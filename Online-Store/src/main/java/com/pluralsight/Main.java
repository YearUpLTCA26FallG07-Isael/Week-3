package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static HashMap<String, Product> products;
    public static ArrayList<Product> cart;

    public static void main(String[] args) {
        products = loadProducts();

        displayItems(products);


    }
    public static HashMap<String, Product> loadProducts() {

        HashMap<String, Product> result = new HashMap<>();
        result.put("ASDF", new Product("ASDF", "asdf asdf", 6.99, "misc"));

        return result;
    }

    public static void showScreenHome(){
        

    }
    public static void showScreenDisplayCart(){


    }
    public static void showScreenDisplayproducts(){


    }
    public static void displayItems(HashMap<String, Product > products){

    }
}