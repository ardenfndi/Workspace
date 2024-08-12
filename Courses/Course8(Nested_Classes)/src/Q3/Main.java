package Q3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();

        try {
            studentManagement.addStudent(new Student(1, "Emre", 21, "Java"));
            studentManagement.addStudent(new Student(2, "Erhan", 22, "Python"));
            studentManagement.addStudent(new Student(3, "Efe", 23, "C++"));
            studentManagement.addStudent(new Student(1, "Emre", 25, "Java")); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Student student = studentManagement.getStudentById(2);
            System.out.println("Student: " + student);
            studentManagement.getStudentById(10);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            studentManagement.updateStudent(2, "Kerem", 23, "Java");
            studentManagement.updateStudent(5, "Emre", 25, "Java");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            studentManagement.deleteStudent(1);
            studentManagement.deleteStudent(25); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        List<Student> allStudents = studentManagement.listAllStudents();
        System.out.println("All students: ");
        for (Student s : allStudents) {
            System.out.println(s);
        }

        List<Student> javaStudents = studentManagement.searchStudentByCourse("Java");
        System.out.println("Students in Java course:");
        javaStudents.forEach(System.out::println);
    }
}
