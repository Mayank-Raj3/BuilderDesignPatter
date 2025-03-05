package org.example.builderdesignpattern.v4;

public class Main {
    public static void main(String[] args) {
        Builder b = new Builder();
        b.setName("Iphone");
        b.setPrice(150);
        b.setDescription("Iphone 15+");
        b.setDescription("this is a apple phone ");
        b.setCompany("Apple");
        b.setCategory("mobile");
        b.setImages("www.apple.com");
        b.setReview(5);


        Product p = new Product(b);

        System.out.println(p);

        /*
        * This coding styles accomplish many things , like validation before object creation
        *
        * the clint/user can pass redundant things to the product class which we don't want
        *
        * b = null
        *
        * Product p = new Product(null);
        *
        *
        *
        *
        * */

    }
}
