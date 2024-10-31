package Car;

public class CarTest {

    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car("BMW", "White", 2022);
        
        System.out.println("First car: " + car1 );
        System.out.println("Second car: " + car2);

        System.out.println("First car with toString: " + car1.toString());
        System.out.println("Second car with toString: " + car2.toString());

        Car car3 = new Car("Audi", "Black", 2018);
        System.out.println("Second car equals to Third car: " + car2.equals(car3));
    }

    
    
}
