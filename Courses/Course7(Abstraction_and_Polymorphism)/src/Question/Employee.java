package Question;
public abstract class Employee {
    private String name;
    private int employeeID;  

    Employee(String name, int employeeID){
        this.name = name;
        this.employeeID = employeeID;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public int getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }
    
    abstract double calculateSalary();
    abstract String getEmployeeDetails();
    
}