package com.example.demoTest.model;

public class HouseHoldProduct extends Product {
    //attribute

    //constructor
    public HouseHoldProduct(String name, String material, String manufacture) {
        super(name, material, manufacture);
    }

    @Override
    public void printInformation() {
        System.out.println("HouseHoldProduct: " + name + ", " + material + ", " + manufacture);
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
}
