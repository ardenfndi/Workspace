package Q2;

public class Student {
    private String name;
    private int enrollmentYear;
    private String major;
    
    public Student(String name, int enrollmentYear, String major){
        this.name = name;
        this.enrollmentYear = enrollmentYear;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString(){
        return "Name: " + name + "Enrollment year: " + enrollmentYear + "Major: " + major;
    }
}
