package Question;
public class FullTimeEmployee extends Employee {
    private double annualSalary;

    FullTimeEmployee(String name, int employeeID, double annualSalary) {
        super(name, employeeID);
        this.annualSalary = annualSalary;
    }
    
    public double getAnnualSalary(){
        return annualSalary;
    }
    
    public void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }
    
    @Override
    double calculateSalary() {
        return annualSalary;
    }

    // Name: Emre, ID: 1, Type: Full Time, Salary: 100000.0
    @Override
    String getEmployeeDetails() {
        return "Name: " + getName() + ", ID: " + getEmployeeID() + ", Type: FullTimeEmployee " + ", Salary: " + annualSalary;   
    }
}
