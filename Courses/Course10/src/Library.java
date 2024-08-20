import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    private HashMap<String, ArrayList<Item>> itemsByGenre;
    private ArrayList<Item> items;
    
    public Library(){
        this.itemsByGenre = new HashMap<>();
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
        // itemsByGenre.putIfAbsent(item.getGenre(), k -> new ArrayList<>()).add(item);
        String genre = item.getGenre();
        if(!itemsByGenre.containsKey(genre)){
            itemsByGenre.put(genre, new ArrayList<>());
        }
        itemsByGenre.get(genre).add(item);
    }

    public void removeItem(int id) throws ItemNotFoundException{
        for(Item item : items){
            if(item.getId() == id){
                items.remove(item);
                String genre = item.getGenre();
                if(itemsByGenre.containsKey(genre)){
                    ArrayList<Item> items = itemsByGenre.get(genre);
                    items.remove(item);
                    if(items.isEmpty()){
                        itemsByGenre.remove(genre);
                    }
                }
                return;                
            }
        }
        throw new ItemNotFoundException("Item with this id can not be found");
    }
    
    public void updateItem(int id, String newtitle, String newGenre, String newAuthor, int publishedYear) throws ItemNotFoundException{
        Item itemUpdate = null;
        for(Item item : items){
            if(item.getId() == id){
                itemUpdate = item;  
            }
        }
        if(itemUpdate == null){
            throw new ItemNotFoundException("Item with this id can not be found");
        }

        if (itemUpdate instanceof Book){
            Book book = (Book) itemUpdate;
            book.setAuthor(newAuthor);
            book.setGenre(newGenre);
            book.setTitle(newtitle);
            book.setPublishedYear(publishedYear);            
        }

        // Update the genre mapping if the genre has changed
        if(!itemUpdate.getGenre().equals(newGenre)){
            ArrayList<Item> items = itemsByGenre.get(itemUpdate.getGenre());
            
            items.remove(itemUpdate);
            if(items.isEmpty()){
                itemsByGenre.remove(itemUpdate.getGenre());
            }
            if(!itemsByGenre.containsKey(newGenre)){
                itemsByGenre.put(newGenre, new ArrayList<>());
            }
            itemsByGenre.get(newGenre).add(itemUpdate);
        }
    }

    public List<Item> searchByTitle(String title) {
        List<Item> results = new ArrayList<>();
        for (Item item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                results.add(item);
            }
        }
        return results;
    }

    public void checkOutItem(int id) throws ItemNotFoundException {
        for (Item item : items) {
            if (item.getId() == id && item instanceof Book) {
                Book book = (Book) item;
                book.setCheckedOut(true);
                return;
            }
        }
        throw new ItemNotFoundException("Book with this ID not found.");
    }

    public void returnItem(int id) throws ItemNotFoundException {
        for (Item item : items) {
            if (item.getId() == id && item instanceof Book) {
                Book book = (Book) item;
                book.setCheckedOut(false);
                return;
            }
        }
        throw new ItemNotFoundException("Book with this ID not found.");
    }

    public void listItemsGroupedByGenre() {
        for (String genre : itemsByGenre.keySet()) {
            System.out.println("Genre: " + genre);
            for (Item item : itemsByGenre.get(genre)) {
                System.out.println(item.getTitle());
            }
        }
    }

    public List<Item> searchByGenre(String genre) {
        if (itemsByGenre.containsKey(genre)) {
            return itemsByGenre.get(genre);
        }
        return new ArrayList<>(); 
    }
    
}
