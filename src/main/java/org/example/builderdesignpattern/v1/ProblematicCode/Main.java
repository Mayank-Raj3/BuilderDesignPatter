package org.example.builderdesignpattern.v1.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        Product p = new Product("Iphone" , 32 ,
                "this is a phone", 5 , "img.com" ,
                "mobile"  , "Apple");
        System.out.println(p);
    /*
    * There are many problem in this version of code
    *
    * 1. We have to remember the order of argument , and also it becomes hard to remeber the argument
    *
    * 2. If we want to have optional argument , then we will be forced to manually put gives some default
    * value in the constructor
    *
    * Some Benefits
    *
    * 1. Easy to read and validate
    *
    */

    /*
    * Now to solve the issue we can have Constructor Overloding but ,
    *
    * It may lead to constructor expolison which meains
    *
    * product(string company , int review , string name ){}
    * product(string company , int review , string description ){}
    *
    * The above 2 are having Same signature string , int name , but diffrent diffrent meaning
    * so in this case the java compiler will give error
    *
    * and there will be lot of compination made to overload the arguments 2^no of argyments
    *
    */



    }
}
