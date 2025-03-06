package org.example.builderdesignpattern.v5;

public class Main {
    public static void main(String[] args) {
        /*
        * first we make an object of get builder and have made that
        * static so that we can call it before makeing object
        *
        *
        * then we make return builder from every setFunctions
        * to obtain this style of coding
        *
        *
        * then in build(Bulder class) function
        * we pass this (builder instace to product) after validating
        * and create the project object
        * */
        Product p = Product.getBuilder() //
                .setName("Iphone 15")
                .setCompany("Apple")
                .setDescription("This is an Iphone")
                .setPrice(1500)
                .build();

        System.out.println(p);
    }
}
