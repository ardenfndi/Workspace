package Inheritance2;

public class Main {

    public static void main(String[] args){

        Car car1 = new Car(null, null, 0, 0, null);
        Car car2 = new Car("BMW", "M3", 30000, 4, "Diesel");
    
        if(car1.equals(car2)){
            System.out.println("Car details are same");
        } else {
            System.out.println("Car details are different");
        }

        if(car1.getNumDoors() == (car2.getNumDoors())){
            System.out.println("Number of doors are same for both cars");
        } else {
            System.out.println("Number of doors are different");
        }

        if (car1.getEngineType() != null && car1.getEngineType().equals(car2.getEngineType())) {
            System.out.println("Engines are the same kind");
        } else if (car1.getEngineType() == null && car2.getEngineType() == null) {
            System.out.println("Both cars have no engine type specified");
        } else {
            System.out.println("Cars have different engines");
        }
    
        System.out.println(car1);
        System.out.println(car2);
    }
    
}
