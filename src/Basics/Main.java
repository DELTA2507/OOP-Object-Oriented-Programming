import Basics.Person;

void main() {
    Person person1 = new Person("Ambersenn", "German", 45);

    person1.setName("Leibarr");

    System.out.println(person1.getName());
    System.out.println(person1.getAge());
    System.out.println(person1.getNationality());
}
