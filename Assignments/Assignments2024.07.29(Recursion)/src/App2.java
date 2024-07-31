import java.util.Scanner;

public class App2 {

    public static int sum(int n){
        if (n > 0){ // Eğer n sıfırdan büyükse,
            return n + sum(n - 1); // n'i (n-1)'in toplamı ile çarparak döner.
        } else { // Eğer n sıfır veya küçükse,
            return 0; // 0 döner, çünkü toplama işleminin sonu.
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan girdi almak için Scanner nesnesi oluşturur.
        System.out.print("Enter a number to calculate: "); // Kullanıcıdan bir sayı girmesini ister.
        int number = scanner.nextInt(); // Kullanıcının girdiği sayıyı okur ve 'number' değişkenine atar.
        if (number <= 0) { // Eğer kullanıcı 0 veya daha küçük bir sayı girdiyse,
            System.out.println("Please enter a number higher than 0"); // Uyarı mesajı yazdırır.
        } else { // Kullanıcı 0'dan büyük bir sayı girdiyse,
            int result = sum(number); // Kullanıcının girdiği sayının toplamını hesaplar.
            System.out.println("The result is: " + result); // Toplam sonucunu ekrana yazdırır.
        }
        scanner.close(); 
    }
}

