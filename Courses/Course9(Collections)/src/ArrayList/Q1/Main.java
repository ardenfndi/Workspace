package ArrayList.Q1;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        
        
        try {
            // adding items
            inventory.addItem(new Item("A001", "Laptop", 10, 999.99));
            inventory.addItem(new Item("A002", "Mouse", 50, 19.99));
            
            try {
                inventory.addItem(new Item("A001", "Laptop", 0, 0));
            } catch (DuplicateItemException e) {
                System.out.println(e.getMessage());
            }

            // updating items
            inventory.updateItem("A001", 15, 950.99);

            // removing items (that does not exist)
            try {
                inventory.removeItem("A003");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            // searching items by id
            try {
                Item item = inventory.searchItemById("A004");
            } catch (ItemNotFoundException e) {
                System.out.println(e.getMessage());
            }

            // searching items by name
            
            List<Item> returnedItems = inventory.searchItemsByName("Laptop");
            System.out.println(returnedItems);

            // Searching items by price range
            try {
                List<Item> itemsInPriceRange = inventory.searchItemsByPriceRange(10.00, 100.00);
                System.out.println("Items in price range: " + itemsInPriceRange);
            } catch (Exception e) {
                System.out.println(e.getMessage());   
            }

            // Searching items by quantity range
            try {
                List<Item> itemsInQuantityRange = inventory.searchItemsByQuantity(5, 20);
                System.out.println("Items in quantity range: " + itemsInQuantityRange);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            inventory.displayAllItems();

        } catch (DuplicateItemException e) {
            e.printStackTrace();
        }catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        } 
    }
}
