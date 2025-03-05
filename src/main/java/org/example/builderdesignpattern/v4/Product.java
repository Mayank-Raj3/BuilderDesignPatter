package org.example.builderdesignpattern.v4;


import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;

import java.util.HashMap;

public class Product{
    private String name ;
    private int price;
    private String description;
    private int review ;
    private String images;
    private String category;
    private String company ;

    Product(Builder b){
        if(b.getPrice() == 0 ){
            throw new IllegalArgumentException("Price must be greater than 0");
        }
        this.price = b.getPrice();
        this.description = b.getDescription();
        this.review = b.getReview();
        this.images = b.getImages();
        this.category = b.getCategory();
        this.company = b.getCompany();
        this.name = b.getName();

    }


    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", description=" + description + ", review=" + review;
    }
}

