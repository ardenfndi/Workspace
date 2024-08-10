package Course;

/**
 * Person
 */
public class Person implements TestInterface {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void print() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}