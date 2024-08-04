package Ex1;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Emre", 99, 100);
        Student student2 = new Student(student1);
        Student student3 = new Student();

        System.out.println("Name of student2 is: " + student2.getName());
        student2.setName("Erhan");
        System.out.println("Name of student2 is: " + student2.getName()); 

        student1.display();
        student2.display();
        student3.display();
    }
}