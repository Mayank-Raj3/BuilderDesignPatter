package org.example.builderdesignpattern.v2;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.setName("Iphone 15");
        p.setPrice(1500);
        p.setCategory("mobile");
        //....


        System.out.println(p);

        /*
        * Using getter Setters is also a way
        *
        * Some of the advantages of using it is :
        *   - we dont have to remember the arguments
        *   - readable
        *   - manageable
        *   - extendable
        *
        * Problems that we face is that :
        *  1. Validation of the Objects before creation
        *   in this we are first creating the object --> then setting the things -> then validation
        *
        * 2. Immutable Objects , we cant set the value after creation
        *
        *
        * */

    }
}
