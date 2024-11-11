package Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Red", 2022);

        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);

        System.out.println("Car 1 toString: " + car1.toString());
        System.out.println("Car 2 toString: " + car2.toString());

        System.out.println("Car 1 equals Car 2: " + car1.equals(car2));
        Car car3 = new Car("Toyota", "Red", 2022);
        System.out.println("Car 2 equals Car 3: " + car2.equals(car3));
    }
}
