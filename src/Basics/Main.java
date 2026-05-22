import Basics.Person;
import Basics.Car;

// Anonymous Object initialization
public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

void main() {
    Person person1 = new Person("Ambersenn", "German", 45, null);
    Person person2 = new Person("Harrison", "Luxemburgo");

    person1.setName("Hans Vaulsendorff");
    person2.setNationality("Japan");
    person2.setName("Ukyo Sanagi");

    // Another example of anonymous object initialization
    // Instead of declaring "Class varName = new Class" it gets declared right on the spot
    // Different from being called as a pre-existing variable
    person1.setCar(new Car(person1.getName(), "BMW", "M3 GTR", "2005", "White Pearlescent"));

    System.out.println("--- Person ---");
    System.out.println("Name: " + person1.getName());
    System.out.println("Age: " + person1.getAge());
    System.out.println("Nationality: " + person1.getNationality());

    Car person1Car = person1.getCar();
    System.out.println(
            "\n--- Car ---" +
            "\nOwner: " + person1Car.getOwner() +
            "\nBrand: " + person1Car.getBrand() +
            "\nModel: " + person1Car.getModel() +
            "\nColor: " + person1Car.getColor()
    );
}
