package Q2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentManager {
    private List<Student> students;
    private final String fileName = "students.txt";
        
    public StudentManager(){
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
        writeToFile();
    }

    private void writeToFile(){
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Student student : students) {
                writer.write(student.getName() + ", " + student.getEnrollmentYear() + ", " + student.getMajor() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public void readStudentsFromFile(){
        students.clear();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split(", ");
                students.add(new Student(data[0], Integer.parseInt(data[1]), data[2]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    
    public void displayAllStudents(){
        for(Student student : students){
            System.out.println(student);
        }
    }

    public void searchStudentByName(String name){
        students.stream()
            .filter(student -> student.getName().equals(name))
            .forEach(System.out::println);
    }

    public void updateStudentMajor(String name, String newMajor){
        for(Student student : students){
            if(student.getName().equals(name)){
                student.setMajor(newMajor);
            }
        }
        writeToFile();
    }

    public void deleteStudentName(String name){
        students.removeIf(student -> student.getName().equals(name));
        writeToFile();
    }

    public void addStudent(String name, int enrollmentYear, String major) {
        Student student = new Student(name, enrollmentYear, major);
        addStudent(student);
    }

    public void addStudent(List<Student> students) {
        this.students.addAll(students);
        writeToFile();
    }
    
    
}
