import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "src/example.bin";
        
        // Writing data to a file
        // FileOutputStream fos = new FileOutputStream(fileName);
        // DataOutputStream dos = new DataOutputStream(fos);
        // dos.writeInt(12345);
        // dos.writeDouble(50.50);
        // dos.writeBoolean(true);
        // dos.writeUTF("Hello World");

        // System.out.println("Data has been written to " + fileName);
        // dos.close();

        // Reading data from a file
        // FileInputStream fis = new FileInputStream(fileName);
        // DataInputStream dis = new DataInputStream(fis);

        // int intValue = dis.readInt();
        // double doubleValue = dis.readDouble();
        // boolean booleanValue = dis.readBoolean();
        // String stringValue = dis.readUTF();

        // System.out.println("Int Value: " + intValue);
        // System.out.println("Double Value: " + doubleValue);
        // System.out.println("Boolean Value: " + booleanValue);
        // System.out.println("String Value: " + stringValue);
        
        // dis.close();


        // Writing objects to a file
        // FileOutputStream fos = new FileOutputStream(fileName);
        // ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Person person = new Person("John Doe", 30, 50000.50);
        // oos.writeObject(person);
        // System.out.println("Person object has been written to " + fileName);
        // oos.close();

        // Reading objects from a file
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Person person = (Person) ois.readObject();
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Salary: " + person.getSalary());
        ois.close();
    }
}

/**
 * Person
 */
class Person implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}