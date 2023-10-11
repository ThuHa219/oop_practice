package com.example.demoTest.model;

public class FoodProduct extends Product {
    //attribute

    //constructor
    public FoodProduct(String name, String material, String manufacture) {
        super(name, material, manufacture);
    }

    @Override
    public void printInformation() {
        System.out.println("FoodProduct: " + name + ", " + material + ", " + manufacture);
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
}
