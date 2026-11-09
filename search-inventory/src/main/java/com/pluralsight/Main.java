package com.pluralsight;
import java.util.Scanner;
import java.io.*;
import java .util.ArrayList;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {




        ArrayList<Product> inventory = getInventory();
        for (Product product : inventory){
            System.out.println(product);
        }

    }
    public static ArrayList<Product> getInventory() throws FileNotFoundException{
        ArrayList<Product> inventory = new ArrayList<>();

        Scanner newScanner = new Scanner(new File("inventory.csv"));
         while(newScanner.hasNextLine()){
             String line = newScanner.nextLine();

             String[] parts = line.split("\\|");

             int id = Integer.parseInt(parts[0]);
             String name = parts[1];
             double price = Double.parseDouble(parts[2]);

             inventory.add(new Product(id , name , price));
         }
         newScanner.close();
        return inventory;
    }

}