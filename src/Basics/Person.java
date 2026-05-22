package Basics;
import Basics.Car;

public class Person {
    // Attributes
    String name;
    String nationality;
    int age;
    Car car;

    // Methods

    // Constructor

    // Overload (Sobrecarga): Dos constructores que reciben Props distintas pero se llaman igual
    public Person(String name, String nationality, int age, Car car) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.car = car;
    }

    public Person(String nationality, String name) {
        this.nationality = nationality;
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getNationality() {
        return nationality;
    }
    public Car getCar() {return car; }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {this.age = age;}
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void setCar(Car car) {this.car = car; }
}
