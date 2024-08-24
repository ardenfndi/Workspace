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
        writeToFile(student);    
    }
    
    public void writeToFile(Student student){
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(student.getName() + ", " + student.getEnrollmentYear() + ", " + student.getMajor() + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }      
    }

    public List<Student> readStudentsFromFile(){
        File file = new File(fileName);
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split(", ");
                String name = data[0];
                int enrollmentYear = Integer.parseInt(data[1]);
                String major = data[2];
    
                students.add(new Student(name, enrollmentYear, major));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }   
        return students;
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
                File file = new File(fileName);
                file.delete();

                for(Student s : students){
                    writeToFile(s);
                }
            }
        }
    }

    public void deleteStudentName(String name){
        for(Student student : students){
            if(student.getName().equals(name)){
                students.remove(student);
                File file = new File(fileName);
                file.delete();

                for(Student s : students){
                    writeToFile(s);
                }
            }
        }
    }
}
