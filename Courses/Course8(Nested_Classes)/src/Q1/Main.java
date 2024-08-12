package Q1;

public class Main {
    public static void main(String[] args){
        Library library = new Library();

        library.addBook(new Book("Emre", "Emre"));
        library.addBook(new Book("Efe", "Efe"));
        
        try {
            library.lendBook("Emre");
            library.lendBook("Emre");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (BookAlreadyLentException e) {
            System.out.println(e.getMessage());
        }
    
        try {
            library.returnBook("Emre");
            library.returnBook("Emre");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (BookNotLentException e) {
            System.out.println(e.getMessage());
        }

        try {
            library.lendBook("Ayberk");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (BookAlreadyLentException e) {
            System.out.println(e.getMessage());
        }
    }
}
