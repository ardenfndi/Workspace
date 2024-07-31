import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) { // Eğer n 0 veya 1 ise,
            return n; // n'i döner, çünkü 0! = 0 ve 1! = 1.
        } else { // Diğer durumlarda,
            return fibonacci(n - 1) + fibonacci(n - 2); // n'inci Fibonacci sayısını hesaplamak için önceki iki Fibonacci sayısını toplar.
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan girdi almak için Scanner nesnesi oluşturur.
        System.out.print("How many Fibonacci numbers would you like to see? "); // Kullanıcıya kaç Fibonacci sayısı görmek istediğini sorar.
        int n = scanner.nextInt(); // Kullanıcının girdiği sayıyı okur ve 'n' değişkenine atar.
        
        if (n <= 0) { // Kullanıcının 0 veya negatif bir sayı girmesini kontrol eder.
            System.out.println("Lütfen 0'dan büyük bir sayı girin."); // Uyarı mesajı yazdırır.
        } else { // Kullanıcının girdiği sayıya kadar olan Fibonacci sayılarını hesaplar ve ekrana yazdırır.
            for (int i = 0; i < n; i++) { // 0'dan n-1'e kadar döngü oluşturur.
            System.out.print(fibonacci(i) + " "); // Her bir Fibonacci sayısını hesaplar ve ekrana yazdırır.
            }
        }
    scanner.close();
    }
}
