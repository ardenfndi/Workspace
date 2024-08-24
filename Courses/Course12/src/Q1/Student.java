package Q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Student {
    public static void main(String[] args){
        String filename = "students.txt";
        writeStudentDataToFile(filename);
        // readStudentDataFromFile(filename);
        extractAndManipulate(filename);
    }

    public static void writeStudentDataToFile(String filename){
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Emre, 2003, Computer Science\n");
            writer.write("John, 2004, Physics\n");
            writer.write("Alice, 2005, Mathematics\n");
            writer.write("Mary, 2006, Biology \n");
            writer.write("George, 2002, Chemistry\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }


    public static void readStudentDataFromFile(String filename){
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public static void extractAndManipulate(String filename){
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split(", ");
                String name = data[0];
                int enrollmentYear = Integer.parseInt(data[1]);
                String major = data[2];
                int duration = 2024 - enrollmentYear;
                
                System.out.println("Name: " + name);
                System.out.println("Enrollment Year: " + enrollmentYear);
                System.out.println("Major: " + major);
                System.out.println("Duration: " + duration + " years");

                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
