public class Student {
    private String studentId;
    private String name;
    private int age;
    private double gpa;

    public Student(String studentId, String name, int age, double gpa){
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gpa =gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", name=" + name + ", age=" + age + ", gpa=" + gpa + '}';
    }
    
}
