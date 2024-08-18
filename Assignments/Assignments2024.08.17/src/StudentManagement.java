import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManagement {

    HashMap<String, Student> students;

    public StudentManagement(){
        students = new HashMap<>();
    }
    
    public void addStudent(Student student) throws DuplicateStudentException{
        if(students.containsKey(student.getStudentId())){
            throw new DuplicateStudentException("Student with same ID already exists");
        }
        students.put(student.getStudentId(), student);
    }

    public void removeStudent(String studentId) throws StudentNotFoundException{
        if(!students.containsKey(studentId)){
            throw new StudentNotFoundException("Student with this ID does not exists");
        }
        students.remove(studentId);
    }

    public void updateStudentGpa(String studentId, double newGpa) throws StudentNotFoundException{
        Student student = students.get(studentId);
        if(!students.containsKey(studentId)){
            throw new StudentNotFoundException("Student with this ID does not exists");
        }
        student.setGpa(newGpa);
    }

    public Student searchStudentById(String studentId) throws StudentNotFoundException{
        Student student = students.get(studentId);
        if(!students.containsKey(studentId)){
            throw new StudentNotFoundException("Student with this ID does not exists");
        }
        return student;
    }

    public List<Student> getStudentsByGpa(double minGpa, double maxGpa){
        List<Student> result = new ArrayList<>();
        for(Student student : students.values()){
            if(student.getGpa() >= minGpa && student.getGpa() <= maxGpa){
                result.add(student);
            }
        }
        return result;
    }

    public List<Student> getStudentByAgeRange(int minAge, int maxAge){
        List<Student> result = new ArrayList<>();
        for(Student student : students.values()){
            if(student.getAge() >= minAge && student.getAge() <= maxAge){
                result.add(student);
            }
        }
        return result;
    }

    public double calculateAvarageGpa(){
        double totalGpa = 0.0;
        for(Student student : students.values()){
            totalGpa += student.getGpa();
        }
        return totalGpa / students.size();
    }
    
    public Map<Integer, List<Student>> groupStudentsByAge(){
        Map<Integer, List<Student>> groupedStudents = new HashMap<>();
        for(Student student : students.values()){
            int age = student.getAge();
            if(!groupedStudents.containsKey(age)){
                groupedStudents.put(age, new ArrayList<>());
            }
            groupedStudents.get(age).add(student);
        }
        return groupedStudents;
    } 
}
