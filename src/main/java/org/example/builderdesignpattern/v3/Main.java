package org.example.builderdesignpattern.v3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating a HashMap with product details

            HashMap<String, Object> productData = new HashMap<>();
            productData.put("name", "Smartphone");
            productData.put("price", 999);
            productData.put("description", "Latest 5G smartphone with 128GB storage");
            productData.put("review", 5);
            productData.put("images", "smartphone.jpg");
            productData.put("category", "Electronics");
            productData.put("company", "TechCorp");

            // Creating a Product object
            Product product = new Product(productData);
            System.out.println(product);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        /*
        * Since there were to many constructor in the class so we can pass
        * All the constructor inside a datastructures such as HashMap where we dont have any problem
        *
        *
        * Product(DS){
        *
        * }
        *
        *DS - > Hash Map -> Key -> Value pair
        *
        *
        * Some Problem With this code is given Below
        *
        *
        *
        *
        *
        * */

    }
}
