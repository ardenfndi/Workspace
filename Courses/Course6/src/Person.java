/**
 * Person
 */
public class Person {

    // Properties
    private String name;
    private int age;
    private double weight;

    // Constructor
    // 1. Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.weight = 0.0;
    }

    // 2. Parameterized Constructor
    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // 3. Copy Constructor
    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.weight = person.weight;
    }

    // Methods
    // 1. Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    // 2. Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printPerson(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.weight);
        System.out.println();
    }
}