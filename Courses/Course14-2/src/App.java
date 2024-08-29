public class App {
    public static void main(String[] args) throws Exception {
        GenericBag<String> bag = new GenericBag<String>();
        bag.add("Hello");
        bag.add("World");
        bag.add("World");
        bag.add("World");
        bag.add("!");
        System.out.println(bag);

        GenericBag<Integer> bag2 = new GenericBag<Integer>();
        bag2.add(1);
        bag2.add(2);
        bag2.add(3);
        System.out.println(bag2);

        GenericBag<Double> bag3 = new GenericBag<Double>();
        bag3.add(1.1);
        bag3.add(2.2);
        bag3.add(3.3);
        System.out.println(bag3);

        GenericBag<Character> bag4 = new GenericBag<Character>();
        bag4.add('a');
        bag4.add('b');
        bag4.add('c');
        System.out.println(bag4);
    }
}
