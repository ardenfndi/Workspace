package Ex1;

public class Student {
    String name;
    int studentID;
    int grade;

    public Student(){
        this.name = "";
        this.studentID = 0;
        this.grade = 0;
    }

    public Student(String name, int studentID, int grade){
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
    }

    public Student(Student student){
        this.name = student.name;
        this.studentID = student.studentID;
        this.grade = student.grade;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public int getStudentID(){
        return studentID;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public void display(){
        System.out.println("Name is: " + name);
        System.out.println("Student ID is: " + studentID);
        System.out.println("Grade is: " + grade);
        System.out.println();
    }
    
}







/*
        Implement a class called Student that has the following properties:
        - A name
        - A student ID number
        - A grade

        Implement default constructor, parameterized constructor, and copy constructor for the Student class.
        Implement all getter and setter methods for the Student class.
        Implement a method called display() that displays the student's name, ID number, and grade.
    */