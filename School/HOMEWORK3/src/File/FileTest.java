package File;

public class FileTest {

    public static void main(String[] args){
        File file1 = new File();
        File file2 = new File("Homework", ".java", 248);

        System.out.println("First file: " + file1);
        System.out.println("Second file: " + file2);

        System.out.println("First file with toString: " + file1.toString());
        System.out.println("Second file with toString: " + file2.toString());

        File file3 = new File("Homework", ".java", 248);
        System.out.println("Second file equals to third file: " + file2.equals(file3));
    }
}
