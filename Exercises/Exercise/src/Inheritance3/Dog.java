package Inheritance3;

public class Dog extends Animal{
    private String breed;

    public Dog(){
        super("Unknown Dog", 0);
        this.breed = "Unknown";
    }

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }

    @Override
    public String toString(){
        return "Animal: " + getName() + " Age: " + getAge() + " Breed: " + breed;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    @Override
    public boolean equals(Object obj){
       if(obj == null){
        return false;
       } else if(getClass() != obj.getClass()){
        return false;
       } else {
        Dog doge = (Dog) obj;
        return(getName().equals(doge.getName()) && breed.equals(doge.breed) && getAge() == doge.getAge());
       }

    }
    
}
