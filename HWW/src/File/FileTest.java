package File;
public class FileTest {
    public static void main(String[] args) {
        File file1 = new File();
        File file2 = new File("Document", "pdf", 5.0);

        System.out.println("File 1: " + file1);
        System.out.println("File 2: " + file2);

        System.out.println("File 1 toString: " + file1.toString());
        System.out.println("File 2 toString: " + file2.toString());

        System.out.println("File 1 equals File 2: " + file1.equals(file2));
        File file3 = new File(file2);
        System.out.println("File 2 equals File 3: " + file2.equals(file3));
    }
}
