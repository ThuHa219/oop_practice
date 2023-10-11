ElectricProductpackage com.example.demoTest.model;

public abstract class Product {

    // ? ìnterface

    //attribute
    public String name;

    public String material;

     String manufacture;

    //constructor
    public Product(String name, String material, String manufacture) {
        this.name = name;
        this.material = material;
        this.manufacture = manufacture;
    }

    public abstract void printInformation();

    public abstract void setName(String name);

}
