package Q2;

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String department;

    public Employee(int id, String name, int age, double salary, String department){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    @Override

    public String toString(){

        return "Employee Id: " + id + " Name: " + name + " Age: " + age +  " Salary: " + salary + " Department: " + department;
    }
    
}
