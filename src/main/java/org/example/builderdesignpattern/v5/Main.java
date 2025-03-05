package org.example.builderdesignpattern.v5;

public class Main {
    public static void main(String[] args) {
        Product p = Product.getBuilder()
                .setName("Iphone 15")
                .setCompany("Apple")
                .setDescription("This is an Iphone")
                .setPrice(1500)
                .build();

        System.out.println(p);
    }
}
