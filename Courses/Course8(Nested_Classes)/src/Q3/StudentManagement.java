package Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

public class StudentManagement {
    private static List<Student> students;

    public StudentManagement(){
        this.students = new ArrayList<>();
    }
    
    public void addStudent(Student student){
        students.add(student);
    }
    
    public Student getStudentById(int id) throws StudentNotFoundException {
        return findStudentById(id);
    }
    
    private Student findStudentById(int id) throws StudentNotFoundException{
        for(Student student : students){
            if(student.getId() == id){
                System.out.println("Student found: " + student);
                return student;
            }
        }
        throw new StudentNotFoundException("Student not found");
    }

    public void updateStudent(int id, String name,int age, String course) throws StudentNotFoundException {
        Student student = getStudentById(id);
        student.setName("Emre");
        student.setAge(21);
        student.setCourse("CS105");
    }
    public void deleteStudent(int id) throws StudentNotFoundException{
        for(Student student : students){
            if(student.getId() == id){
                students.remove(student);
                System.out.println("Student removed: " + student);
                return;
            }

        }
        throw new StudentNotFoundException("Student with ID " + id + " not found.");
    }

    public  List<Student> listAllStudents(){
        return students;
    }
    public static List<Student> searchStudentByCourse(String course){
        List<Student> result = new ArrayList<>();
        for(Student student : students){
            if(student.getCourse().equals(course)){
                result.add(student);
            }
        }
        return result;
    }


    
}
