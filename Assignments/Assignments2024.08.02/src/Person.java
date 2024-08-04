public class Person {
    String name;
    int age;
    int wage;
    String address;

    public Person(String name, int age, int wage, String adress){
        this.name = name;
        this.age = age;
        this.wage = wage;
        this.address = adress;
    }

    public void display(){
        
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Wage is: " + wage);
        System.out.println("Address is: " + address);

    }

    public static void main(String[] args){
        Person myPerson = new Person("Emre", 21, 1000, "Izmir");
        myPerson.display();
    }
    
}
