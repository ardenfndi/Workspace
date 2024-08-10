package Question;
public class Main {
    public static void main(String[] args){
        FullTimeEmployee employee1 = new FullTimeEmployee("John Doe", 101, 50000.0);
        PartTimeEmployee employee2 = new PartTimeEmployee("Jane Smith", 102, 200, 10);
        
        String detail1 = employee1.getEmployeeDetails();
        System.out.println(detail1);

        String detail2 = employee2.getEmployeeDetails();
        System.out.println(detail2);
        
        double salary1 = employee1.calculateSalary();
        double salary2 = employee2.calculateSalary();

        System.out.println("Total salary is:" + (salary1 + salary2));
    }
    
}
