FoodProductHouseHoldProductpackage com.example.demoTest.model;

public class ElectricProduct extends Product {

    //attribute
    String electricPotential;

    //constructor
    public ElectricProduct(String name, String material, String manufacture, String electricPotential) {
        super(name, material, manufacture); // call constructor of super class
        this.electricPotential = electricPotential;
    }

    @Override
    public void printInformation() {
        System.out.println("ElectricProduct: " + name + ", " + material + ", " +
                manufacture + ", " + electricPotential);
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }
}
