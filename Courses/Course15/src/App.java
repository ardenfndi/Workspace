public class App {
    // Main method for testing
    public static void main(String[] args) {
        LinkekdList list = new LinkekdList();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(15,1);
        System.out.println("List after additions: " + list);

        // Getting elements
        System.out.println("Element at index 2: " + list.get(2));

        // Removing elements
        list.remove(2);
        System.out.println("List after removing element at index 2: " + list);
        list.removeData(15);
        System.out.println("List after removing element 15: " + list);

        // Setting elements
        list.set(1, 25);
        System.out.println("List after setting element at index 1 to 25: " + list);

        // Checking contains
        System.out.println("List contains 25: " + list.contains(25));
        System.out.println("List contains 30: " + list.contains(30));

        // Clearing the list
        list.clear();
        System.out.println("List after clearing: " + list);

        // Checking size and isEmpty
        System.out.println("Size of list: " + list.getSize());
        System.out.println("Is list empty: " + list.isEmpty());
    }
}
