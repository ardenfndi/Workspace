package ArrayBag;

public class TestBag {
    public static void main(String[] args) {

        BagInterface1<String> myBag = new ArrayBag<>(100);

        @SuppressWarnings("unused")
        boolean isEM = myBag.isEmpty();
        @SuppressWarnings("unused")
        boolean ifAlicedded = myBag.add("Alice");

        myBag.add("John");
        myBag.add("Tarik");

        if (myBag.contains("Alice")) {
            System.out.println("Alice is present");
        } else {
            System.out.println("Alice is NOT present");
        }

        if (myBag instanceof ArrayBag) {
            ((ArrayBag<String>) myBag).display();
        }

        myBag.remove("Alice");
        myBag.remove("Array");
        ((ArrayBag<String>) myBag).display();

        myBag.clear();
        ((ArrayBag<String>) myBag).display();  // Çantanın boş olduğunu göstermek için tekrar display çağrısı.
    }
}
