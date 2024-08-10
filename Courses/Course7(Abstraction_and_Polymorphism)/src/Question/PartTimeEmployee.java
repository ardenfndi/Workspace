package Question;
public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    PartTimeEmployee(String name, int employeeID, double hourlyRate, int hoursWorked){
        super(name, employeeID);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }
    
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    public int getHoursWorked(){
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    
    @Override
    String getEmployeeDetails() {
        return "Name: " + getName() + " , ID: " + getEmployeeID() + ", Type: Part Time Employee " + ", Salary: " + hourlyRate;
    }
    
}
