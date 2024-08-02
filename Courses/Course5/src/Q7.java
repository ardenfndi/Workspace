/**
 * Q7
 */
public class Q7 {

    // Implement a function to calculate the power of a number using recursion.
    // The function should have the following signature:
    // public static int power(int base, int exponent)

    public static int power(int base, int exponent) {
        if(exponent != 0){
            return base *  power(base, exponent - 1);
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3)); // 8
        System.out.println(power(3, 3)); // 27
        System.out.println(power(2, 4)); // 16
        System.out.println(power(2, 5)); // 32
    }

    /*
            OOP Principles
            - Inheritance
            - Polymorphism
            - Encapsulation
            - Abstraction

            How to create an object in Java
            How to create an object in java


    */
}