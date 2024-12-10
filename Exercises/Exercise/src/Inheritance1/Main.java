package Inheritance1;
public class Main {

    public static void main(String[] args){
        
        Laptop laptop1 = new Laptop(null, false, 0, 0, 0);
        Laptop laptop2 = new Laptop("Dell",true, 1200, 16, 512);

        if(laptop1.equals(laptop2)){
            System.out.println("Laptop values are same");
        } else {
            System.out.println("Laptops are different");
        }

        if(laptop1.getRamSize() == laptop2.getRamSize()){
            System.out.println("Ram of the 2 laptops are same");
        } else {
            System.out.println("Ram of the two laptops are different");
        }

        System.out.println(laptop1);
        System.out.println(laptop2);

    }   
    
}
