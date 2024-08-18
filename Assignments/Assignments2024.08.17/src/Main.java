import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        StudentManagement management = new StudentManagement();

        try {
            management.addStudent(new Student("S001", "Alice", 20, 3.5));
            management.addStudent(new Student("S002", "Bob", 22, 3.8));
            management.addStudent(new Student("S004", "Bob", 22, 2.5));
            management.addStudent(new Student("S001", "Charlie", 23, 3.7));
            
        } catch (DuplicateStudentException e) {
            System.out.println(e.getMessage());
        }

        try {
            management.updateStudentGpa("S001", 3.9);
            management.removeStudent("S003");
            
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Student student = management.searchStudentById("S002");
            System.out.println(student);

            List<Student> studentsByGpa = management.getStudentsByGpa(3.0, 4.0);
            for(Student student1 : studentsByGpa){
                System.out.println(student1);
            }

            Map<Integer, List<Student>> groupStudentsByAge = management.groupStudentsByAge();
            for(int age : groupStudentsByAge.keySet()){
                System.out.print("Age: " + age + " students: ");
                System.out.println(groupStudentsByAge.get(age));
            }
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        double avarageGpa = management.calculateAvarageGpa();
        System.out.println(avarageGpa);
    }
    
}
