package org.example.builderdesignpattern.v5;


import lombok.Getter;
import lombok.Setter;


public class Product{
    private String name ;
    private int price;
    private String description;
    private int review ;
    private String images;
    private String category;
    private String company ;

    private Product(Builder b){
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

    public static Builder getBuilder() {
        // we made this class static as we need to call this first without creating the product class
        return new Builder();
    }


    @Getter
    public static class Builder { // we made this class static as we need to call this first without creating the
                                // product class
        private String name ;
        private int price;
        private String description;
        private int review ;
        private String images;
        private String category;
        private String company ;

        public Product build(){
            return new Product(this);
        }

        Builder(){

        }
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setPrice(int price){
            this.price = price;
            return this ;
        }
        public Builder setDescription(String description){
            this.description = description;
            return this ;
        }
        public Builder setReview(int review){
            this.review = review;
            return this ;
        }
        public Builder setImages(String images){
            this.images = images;
            return this;
        }
        public Builder setCategory(String category){
            this.category = category;
            return this;
        }
        public Builder setCompany(String company){
            this.company = company;
            return this;
        }



    }



    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", description=" + description + ", review=" + review;
    }
}




