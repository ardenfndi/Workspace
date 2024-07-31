import java.util.Scanner;
public class App {

    static int factorial( int n ) {
        if (n != 0)  // Eğer n sıfır değilse,
            return n * factorial(n-1); // n'i n-1'in faktöriyeli ile çarparak döner.
                else // Eğer n sıfır ise,
            return 1; // 1 döner, çünkü 0! = 1.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan girdi almak için Scanner nesnesi oluşturur.
        System.out.print("Enter a number to calculate: "); // Kullanıcıdan bir sayı girmesini ister.
        int number = scanner.nextInt(); // Kullanıcının girdiği sayıyı okur ve 'number' değişkenine atar.
        int result = factorial(number); // Kullanıcının girdiği sayının faktöriyelini hesaplar.
        System.out.println(number + " factorial is " + result);  // Faktöriyel sonucunu ekrana yazdırır.
        scanner.close();
    }
}


/* 
public class App{ 

static int factorial(int n){
    if (n != 0) // Eğer n sıfır değilse,
        return n * factorial(n-1); // n'i n-1'in faktöriyeli ile çarparak döner.
    else // Eğer n sıfır ise,
        return 1; // 1 döner, çünkü 0! = 1. 
}

public static void main(String[] args){
        int number = 5; // Hesaplanacak sayıyı belirler.
        int result = factorial(number); // Belirlenen sayının faktöriyelini hesaplar.
        System.out.println(number + " factorial is  " + result); // Sonucu ekrana yazdırır.
    }
}
*/