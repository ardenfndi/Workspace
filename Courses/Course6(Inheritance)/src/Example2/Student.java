package Example2;
/**
 * Student
 */
public class Student extends Person {
    private String studentId;
    private String major;
    private double gpa;

    public Student(String name, int age, double weight, String studentId, String major, double gpa) {
        super(name, age, weight);
        this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void display(){
        System.out.println("Name of Student: " + getName());
        System.out.println("Age of Student: " + getAge());
        System.out.println("Weight of Student: " + getWeight());
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }    
}