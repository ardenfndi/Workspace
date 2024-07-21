import java.lang.reflect.Array;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) throws Exception {
        // Let user enter his name and age accordingly, then print out the result in the console

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt(); // "\n"
        // scanner.nextLine(); // Consume the "\n" character
        
        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine(); // "Emre\n"

        // System.out.println("Your name is " + name + "\nYour age is: " + age);
        // ----------------------------------------------------------------------------------------------------------------------

        // Let user enter a number then print out wether it is even or odd

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // if(number % 2 == 0) {
        //     System.out.println("Number is even.");
        // } else {
        //     System.out.println("Number is odd.");
        // }

        // ----------------------------------------------------------------------------------------------------------------------

        /*
            Let user enter his grade, then print out the corresponding letter grade
            90-100: A
            80-89: B
            70-79: C
            60-69: D
            0-59: F
        */

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your grade: ");
        // int grade = scanner.nextInt();

        // if(grade <= 100 && grade >=90){
        //     System.out.println("A");
        // }
        // else if(grade <= 89 && grade >= 80){
        //     System.out.println("B");
        // }
        // else if(grade <= 79 && grade >= 70 ){
        //     System.out.println("C");
        // }
        // else if(grade <= 69 && grade >= 60 ){
        //     System.out.println("D");
        // }
        // else{
        //     System.out.println("F");
        // }

        // ----------------------------------------------------------------------------------------------------------------------

        // Let user enter a number between 1-7, then print out the corresponding day of the week

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number between 1-7: ");
        // int number = scanner.nextInt();

        // switch(number) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2: 
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //        System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default: 
        //         System.out.println("Error the number must be between 1-7");
        // }

        // ----------------------------------------------------------------------------------------------------------------------

        // Let user enter a number, then print out all the numbers from 1 to that number
    
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number: ");
        // int number = scanner.nextInt();

        // for(int i = 1; i < number; i++) {
        //     System.out.println(i);
        // }

        // ----------------------------------------------------------------------------------------------------------------------

        // Let user enter a number, then print out all the even numbers from 1 to that number
    
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt(); 

        // for(int i = 1; i < number; i++){
        //     if(i % 2 == 0){
        //         System.out.println(i);
        //     }
        // }
    
        // ----------------------------------------------------------------------------------------------------------------------

        // Let user enter a number, then print out the sum of all numbers from 1 to that number
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();
        
        // int sum = 0;
        // for(int i = 1; i <= number; i++){
        //     sum+=i;
        // }

        // System.out.println("Sum: " + sum);

        // ----------------------------------------------------------------------------------------------------------------------

        // Define an array of integers with the size of 5, then let user enter 5 numbers and store them in the array. 
        // After that, print out the elements of the array

        // dataType varName; // Declaration
        // Scanner scanner = new Scanner(System.in);
        // int[] numbers = new int[5]; // Initialization
        
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.print("Enter a number: ");
        //     numbers[i] = scanner.nextInt();
        // }

        // System.out.print("Elements of the array: ");
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.print(numbers[i] + " ");
        // }
    }     
}
