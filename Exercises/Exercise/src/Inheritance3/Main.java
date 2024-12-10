package Inheritance3;

public class Main {

    public static void main(String[] args){

        Animal animal1 = new Animal(null, 0);
        Animal animal2 = new Animal("Cat", 5);
        Dog dog1 = new Dog(null, 0, null);
        Dog dog2 = new Dog("Rain", 12, "Yorkshire");


        
        System.out.println("Animal sounds:");
        animal1.makeSound();
        dog1.makeSound();

        System.out.println(animal1.toString());
        System.out.println(animal2.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        if (animal1.getName() == null && animal2.getName() == null) {
            System.out.println("Animals are the same (both have no name)");
        } else if (animal1.getName() != null && animal1.getName().equals(animal2.getName())) {
            System.out.println("Animals are the same");
        } else {
            System.out.println("Animals are different");
        }

        if(dog1.getBreed() == null && dog2.getBreed() == null){
            System.out.println("Both dogs are null");
        } else if( dog1.getBreed() != null && dog1.getBreed().equals(dog2.getBreed())){
            System.out.println("Dogs are same");
        } else {
            System.out.println("Dogs are different");
        }
        
    }
    
}
