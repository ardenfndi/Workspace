package Q2;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student("Emre", 2003, "Computer Science"));
        manager.addStudent("John", 2004, "Physics");
        manager.readStudentsFromFile();
        manager.displayAllStudents();
        manager.searchStudentByName("Emre");
        manager.updateStudentMajor("John", "Mathematics");
        manager.deleteStudentName("Emre");
        manager.displayAllStudents();
    }

    
}
