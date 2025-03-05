package org.example.builderdesignpattern.v4;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Builder {
    private String name ;
    private int price;
    private String description;
    private int review ;
    private String images;
    private String category;
    private String company ;
    Builder(){

    }

}
