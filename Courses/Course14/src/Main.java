import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        try {
            FileOutputStream fis = new FileOutputStream("src/example.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            Person data = new Person("Emre", 21, 80);
            
            oos.writeObject(data);
            oos.close();       
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
        
        try {
            FileInputStream fis = new FileInputStream("src/example.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person person = (Person) ois.readObject();
            System.out.println(person.toString());
            ois.close();
        } catch (IOException | ClassNotFoundException e ) {
            e.printStackTrace();
        }
    }
}

class Person implements Serializable{
    private static final long serialVersionUID = 2L;
    private String name;
    private int age;
    private double weight;

    Person(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    
    @Override
    public String toString(){
        return "Name: " + name + " Age: " + age + " Weight: " + weight;
    }
}