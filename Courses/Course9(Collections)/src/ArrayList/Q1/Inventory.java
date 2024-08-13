package ArrayList.Q1;

import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;
import java.util.List;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory(){
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) throws DuplicateItemException{
        for(Item existingItem :items){
            if(existingItem.getId().equals(item.getId())){
                throw new DuplicateItemException("Item already exists.");
            }
        }
        items.add(item);
    }

    public void removeItem(String id) throws ItemNotFoundException{
        for (Item item : items){
            if(item.getId().equals(id)){
                items.remove(item);
                return;                
            }            
        }
        throw new ItemNotFoundException("Item not found.");   
    }
    
    public void updateItem(String id, int newQuantity, double newPrice) throws ItemNotFoundException{
        for(Item item : items){
            if(item.getId().equals(id)){
                item.setQuantity(newQuantity);
                item.setPrice(newPrice);
                return;
            }
        }
        throw new ItemNotFoundException("Item not found.");
    }
    public Item searchItemById(String id) throws ItemNotFoundException{
        for(Item item : items){
            if(item.getId().equals(id)){
                return item;
            }
        }
        throw new ItemNotFoundException("Item is not found.");
    }
    
    public List<Item> searchItemsByName(String name){
        List<Item> result = new ArrayList<Item>();
        for(Item item : items){
            if(item.getName().equals(name)){
                result.add(item);
            }
        }
        return result;
    }

    public List<Item> searchItemsByPriceRange(double minPrice, double maxPrice){
        List<Item> result = new ArrayList<Item>();
        for(Item item :items){
            if(item.getPrice()>= minPrice && item.getPrice() <= maxPrice){
                result.add(item);
            }
        }
        return result;
    }

    public List<Item> searchItemsByQuantity(int minQuantity, int maxQuantity){
        List<Item> result = new ArrayList<Item>();
        for(Item item : items){
            if(item.getQuantity() >= minQuantity && item.getQuantity() <= maxQuantity){
                result.add(item);
            }
        }
        return result;
    }
    public void displayAllItems(){
        for(Item item : items){
            System.out.println(item);
        }
    }   
}
