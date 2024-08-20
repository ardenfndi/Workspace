import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addItem(new Book(1, "The Great Gatsby", "Fiction", "F. Scott Fitzgerald", 1925, false));
        library.addItem(new Magazine(2, "National Geographic", "Science", 2024, "August 2024"));

        List<Item> searchResults = library.searchByTitle("The Great Gatsby");
        for (Item item : searchResults) {
            System.out.println(" - " + item.getTitle());
        }
        try {
            library.checkOutItem(1);
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            library.returnItem(1);
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Items Grouped by Genre:");
        library.listItemsGroupedByGenre();

        try {
            library.updateItem(1, "The Great Gatsby", "Classic Fiction", "F. Scott Fitzgerald", 1925);
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            library.removeItem(2);
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }
        List<Item> genreResults = library.searchByGenre("Classic Fiction");
        System.out.println("Items in 'Classic Fiction' Genre:");
        for (Item item : genreResults) {
            System.out.println(" - " + item.getTitle());
        }
    }
}
