import java.util.Arrays;

/**
 * GenericBag
 */
public class GenericBag<T> {
    private T[] elements;
    private int[] counts;
    private int size;
    private int capacity;

    public GenericBag(){
        this.capacity = 10;
        this.size = 0;
        this.elements = (T[]) new Object[this.capacity];
        this.counts = new int[this.capacity];
    }

    // Add an element to the bag
    public void add(T element){
        int index = findIndex(element);
        if(index >= 0){
            counts[index]++;
        }
        else{
            if(size == capacity){
                resize();
            }
            elements[size] = element;
            counts[size] = 1;
            size++;            
        }   
    }

    // Remove an element from the bag
    public boolean remove(T element){
        int index = findIndex(element);
        if(index >= 0){
            counts[index]--;
            if(counts[index] == 0){
                removeAt(index);
            }
            return true; // Element removed
        }
        return false; // Element not found
    }

    // Returns the number of occurrences of an element in the bag
    public int count(T element){
        int index = findIndex(element);
        if(index >= 0){
            return counts[index];
        }
        return 0;
    }

    // Check if the bag contains an element
    public boolean contains(T element){
        return findIndex(element) >= 0;
    }

    public int size(){
        int totalSize = 0;
        for(int i = 0; i < size; i++){
            totalSize += counts[i];
        }
        return totalSize;
    }

    private void removeAt(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
            counts[i] = counts[i + 1];
        }
        size--;
    }

    private void resize() {
        capacity *= 2;
        elements = Arrays.copyOf(elements, capacity);
        counts = Arrays.copyOf(counts, capacity);
    }

    private int findIndex(T element) {
        for (int i = 0; i < size; i++) {
            if(elements[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    // "[AYBERK:5,EMRE:3,ALI:2]"
    @Override
    public String toString() {
        // Use String instead of StringBuilder

        String str = "[";
        for(int i = 0; i < size; i++){
            str += elements[i] + ":" + counts[i];
            if(i < size - 1){
                str += ", ";
            }
        }
        str += "]";
        return str;




        // StringBuilder sb = new StringBuilder();
        // sb.append("[");
        // for(int i = 0; i < size; i++){
        //     sb.append(elements[i]);
        //     sb.append(":");
        //     sb.append(counts[i]);
        //     if(i < size - 1){
        //         sb.append(", ");
        //     }
        // }
        // sb.append("]");
        // return sb.toString();
    }
}