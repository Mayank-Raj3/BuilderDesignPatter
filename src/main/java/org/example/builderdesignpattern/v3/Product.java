package org.example.builderdesignpattern.v3;


import java.util.HashMap;

public class Product{
    private String name ;
    private int price;
    private String description;
    private int review ;
    private String images;
    private String category;
    private String company ;

    Product(HashMap<String,Object> map){
        if(map.get("price").equals(0)){
            throw new IllegalArgumentException("Price must be greater than 0");
        }

        this.name = (String) map.get("name");
        this.price = (Integer) map.get("price");
        this.description = (String) map.get("description");
        this.review = (Integer) map.get("review");
        this.images = (String) map.get("images");
        this.category = (String) map.get("category");
        this.company = (String) map.get("company");

    }


    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", description=" + description + ", review=" + review;
    }
}

