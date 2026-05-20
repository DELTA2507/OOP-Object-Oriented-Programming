package Basics;

public class Person {
    // Attributes
    String name;
    String nationality;
    int age;

    // Methods

    // Constructor
    public Person(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
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

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
