package org.example.builderdesignpattern.v2;


public class Product{
    private String name ;
    private int price;
    private String description;
    private int review ;
    private String images;
    private String category;
    private String company ;

    Product(){

    }
    public Product(String name, int price, String description, int review, String images, String category, String company){
        this.name = name;
        this.price = price;
        this.description = description;
        this.review = review;
        this.images = images;
        this.category = category;
        this.company = company;
    }

    void setName(String name){
        this.name = name;
    }
    void setPrice(int price){
        if(price<0) throw new IllegalArgumentException("Price must be greater than or equal to zero");
        this.price = price;
    }
    void setDescription(String description){
        this.description = description;
    }
    void setReview(int review){
        this.review = review;
    }
    void setImages(String images){
        this.images = images;
    }
    void setCategory(String category){
        this.category = category;
    }
    void setCompany(String company){
        this.company = company;
    }

    String getName(){
        return name;
    }
    int getPrice(){
        return price;
    }
    String getDescription(){
        return description;
    }
    int getReview(){
        return review;
    }
    String getImages(){
        return images;
    }
    String getCategory(){
        return category;
    }
    String getCompany(){
        return company;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", description=" + description + ", review=" + review;
    }
}

