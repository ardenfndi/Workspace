package ArrayBag;

import java.util.Arrays;

public class ArrayBag<T> implements BagInterface1<T> {

    private T[] bag;
    private int numberOfElements;
    private static final int DEFAULT_CAPACITY = 25;
    private static final int MAX_CAPACITY = 10000;

    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayBag(int capacity) {
        if (capacity <= MAX_CAPACITY) {
            bag = (T[]) new Object[capacity];
            numberOfElements = 0;
        } else {
            throw new IllegalStateException("Attempt to create a bag whose capacity exceeds allowed maximum.");
        }
    }

    public int getCurrentSize() {
        return numberOfElements;
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public boolean add(T newEntry) {
        if (isFull()) {
            return false;
        } else {
            bag[numberOfElements] = newEntry;
            numberOfElements++;
            return true;
        }
    }

    public T remove() {
        if (isEmpty()) {
            return null;
        } else {
            T result = bag[numberOfElements - 1];
            bag[numberOfElements - 1] = null;
            numberOfElements--;
            return result;
        }
    }

    public boolean remove(T anEntry) {
        int index = getIndexOf(anEntry);
        if (index > -1) {
            removeAtIndex(index);
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    }

    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        for (int i = 0; i < numberOfElements; i++) {
            if (anEntry.equals(bag[i])) {
                frequency++;
            }
        }
        return frequency;
    }

    public boolean contains(T anEntry) {
        return getIndexOf(anEntry) > -1;
    }

    public T[] toArray() {
        return Arrays.copyOf(bag, numberOfElements);
    }

    private int getIndexOf(T anEntry) {
        for (int i = 0; i < numberOfElements; i++) {
            if (anEntry.equals(bag[i])) {
                return i;
            }
        }
        return -1;
    }

    private void removeAtIndex(int index) {
        bag[index] = bag[numberOfElements - 1];
        bag[numberOfElements - 1] = null;
        numberOfElements--;
    }

    public void display() {
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(bag[i] + " ");
        }
        System.out.println();
    }

    private boolean isFull() {
        return numberOfElements >= bag.length;
    }
}
