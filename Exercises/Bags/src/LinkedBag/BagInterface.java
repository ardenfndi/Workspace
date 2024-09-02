package LinkedBag;


public interface BagInterface<T> {
    int getCurrentSize();    // Returns the current number of entries in the bag.
    boolean isFull();        // Checks if the bag is full.
    boolean isEmpty();       // Checks if the bag is empty.
    boolean add(T newEntry); // Adds a new entry to the bag.
    T remove();              // Removes an unspecified entry from the bag.
    boolean remove(T anEntry); // Removes a specific entry from the bag.
    void clear();            // Removes all entries from the bag.
    int getFrequencyOf(T anEntry); // Counts the number of times a given entry appears in the bag.
    boolean contains(T anEntry);   // Checks if the bag contains a given entry.
    T[] toArray();            // Returns an array of all entries in the bag.
    void display();
}
