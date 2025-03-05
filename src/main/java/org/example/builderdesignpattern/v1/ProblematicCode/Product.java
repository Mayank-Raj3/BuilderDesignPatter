package org.example.builderdesignpattern.v1.ProblematicCode;


public class Product{
    public String name ;
    public int price;
    public String description;
    public int review ;
    public String images;
    public String category;
    public String company ;

    public Product(String name, int price, String description, int review, String images, String category, String company){
        this.name = name;
        this.price = price;
        this.description = description;
        this.review = review;
        this.images = images;
        this.category = category;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", description=" + description + ", review=" + review;
    }
}

