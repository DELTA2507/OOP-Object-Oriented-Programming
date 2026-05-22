package Basics;

public class Car {
    // Attributes
    String owner;
    String brand;
    String model;
    String year;
    String color;

    // Methods

    // Constructor
    public Car(String owner, String brand, String model, String year, String color) {
        this.owner = owner;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Getters
    public String getOwner() {return owner;}
    public String getColor() {
        return color;
    }
    public String getYear() {
        return year;
    }
    public String getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }

    // Setters
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void setColor(String color) {
        this.color = color;
    }
}