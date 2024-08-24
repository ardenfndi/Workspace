import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // File file = new File("test.txt");

        // if (file.exists()) {
        //     System.out.println("File exists");
        // } else {
        //     System.out.println("Creating file");
        //     try {
        //         file.createNewFile();
        //     } catch (Exception e) {
        //         System.out.println("Error creating file: " + e.getMessage());
        //     }
        // }
        
        // // File methods
        // // 1. Check if file exists
        // System.out.println("File exists: " + file.exists());

        // // 2. Get file name
        // System.out.println("File name: " + file.getName());

        // // 3. Get file path
        // System.out.println("File path: " + file.getPath());

        // // 4. Get file absolute path
        // System.out.println("File absolute path: " + file.getAbsolutePath());

        // // 5. Get file parent directory
        // System.out.println("File parent directory: " + file.getParent());

        // // 6. Check if file is a directory
        // System.out.println("Is directory: " + file.isDirectory());

        // // 7. Check if file is a file
        // System.out.println("Is file: " + file.isFile());

        // // 8. Get file size
        // System.out.println("File size: " + file.length());

        // // 9. Get file last modified time
        // System.out.println("Last modified time: " + file.lastModified());

        // // 10. Delete file
        // if (file.delete()) {
        //     System.out.println("File deleted");
        // } else {
        //     System.out.println("Error deleting file");
        // }

        // // 11. List files in a directory
        // File dir = new File(".");
        // String[] files = dir.list();
        // System.out.println("Files in current directory:" + Arrays.toString(files));

        // // 12. List files in a directory with filter
        // dir = new File("src/");
        // File[] filesWithFilter = dir.listFiles((d, name) -> name.endsWith(".java"));
        // System.out.println("Java files in src directory:" + Arrays.toString(filesWithFilter));

        // // 13. Create directory
        // File newDir = new File("newDir");
        // if (newDir.mkdir()) {
        //     System.out.println("Directory created");
        // } else {
        //     System.out.println("Error creating directory");
        // }

        // 14. Rename file
        // File oldFile = new File("old.txt");

        // // if (!oldFile.exists()) {
        // //     try {
        // //         oldFile.createNewFile();
        // //     } catch (Exception e) {
        // //         System.out.println("Error creating file: " + e.getMessage());
        // //     }
        // // }

        // File newFile = new File("new.txt");
        // if (oldFile.renameTo(newFile)) {
        //     System.out.println("File renamed");
        // } else {
        //     System.out.println("Error renaming file");
        // }

        // 15. Move file
        // File oldFile = new File("old.txt");

        // if (!oldFile.exists()) {
        //     try {
        //         oldFile.createNewFile();
        //     } catch (Exception e) {
        //         System.out.println("Error creating file: " + e.getMessage());
        //     }
        // }

        // File newFile = new File("newDir/new.txt");
        // if (oldFile.renameTo(newFile)) {
        //     System.out.println("File moved");
        // } else {
        //     System.out.println("Error moving file");
        // }

        // 16. Copy file

        // File oldFile = new File("old.txt");

        // if (!oldFile.exists()) {
        //     try {
        //         oldFile.createNewFile();
        //     } catch (Exception e) {
        //         System.out.println("Error creating file: " + e.getMessage());
        //     }
        // }

        // File newFile = new File("newDir/new.txt");
        // if (oldFile.renameTo(newFile)) {
        //     System.out.println("File copied");
        // } else {
        //     System.out.println("Error copying file");
        // }

        // // 17. Can read
        // File file = new File("test.txt");
        // System.out.println("Can read: " + file.canRead());

        // // 18. Can write
        // System.out.println("Can write: " + file.canWrite());

        // // 19. Can execute
        // System.out.println("Can execute: " + file.canExecute());

        // Write to file
        // Read from file
        // How to extract data from a file

        /*
                Emre, 2003, Computer Science
                John, 2004, Physics
                Alice, 2005, Mathematics
        */

        // 20. Write to file
        // File file = new File("students.txt");
        // String data = "Emre, 2003, Computer Science\nJohn, 2004, Physics\nAlice, 2005, Mathematics";

        // try {
        //     FileWriter writer = new FileWriter(file);
        //     writer.write(data);
        //     writer.close(); // Close the file
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // System.out.println("Data written to file");

        // 21. Read from file
        // File file = new File("students.txt");
        // try {
        //     Scanner scanner = new Scanner(file);
        //     while (scanner.hasNextLine()) {
        //         String line = scanner.nextLine();
        //         System.out.println(line);
        //     }
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }

        // 22. Extract data from file
        // File file = new File("students.txt");
        // try {
        //     Scanner scanner = new Scanner(file);
        //     while (scanner.hasNextLine()) {
        //         String line = scanner.nextLine();
        //         String[] parts = line.split(", ");
        //         String name = parts[0];
        //         int year = Integer.parseInt(parts[1]);
        //         String major = parts[2];

        //         System.out.println("Name: " + name);
        //         System.out.println("Year: " + year);
        //         System.out.println("Major: " + major);
        //         System.out.println();
        //     }
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }

        

    }
}
