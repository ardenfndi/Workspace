import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        // ArrayList Stream Operations

        // 1. forEach
        // 2. filter
        // 3. map
        // 4. collect
        // 5. reduce
        // 6. flatMap
        // 7. sorted
        // 8. distinct
        // 9. limit
        // 10. skip
        // 11. anyMatch
        // 12. allMatch
        // 13. noneMatch
        // 14. findFirst
        // 15. findAny
        // 16. count
        // 17. min
        // 18. max
        // 19. toArray
        // 20. sum
        // 21. average
        
        // 1. forEach
        // Scenario: Print all elements of the list
        // ArrayList<String> list = new ArrayList<>();
        // list.add("Apple");
        // list.add("Banana");
        // list.add("Cherry");
        // list.add("Dates");
        // list.add("Elderberry");

        // Stream<String> stream = list.stream(); 
        // stream.forEach(System.out::println);

        // 2. filter
        // Scenario: Filter elements that start with 'A'
        // ArrayList<String> list = new ArrayList<>();
        // list.add("Apple");
        // list.add("Banana");
        // list.add("Apricot");
        // list.add("Avocado");
        // list.add("Elderberry");

        // Stream<String> stream = list.stream();
        // stream.filter(s -> s.startsWith("A")).forEach(System.out::println);

        // 3. map
        // Scenario: Convert all elements to uppercase
        // ArrayList<String> list = new ArrayList<>();
        // list.add("Apple");
        // list.add("Banana");
        // list.add("Cherry");
        // list.add("Dates");
        // list.add("Elderberry");

        // Stream<String> stream = list.stream();
        // stream.map(String::toUpperCase).forEach(System.out::println);

        // Scenario: Find square of all elements
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // Stream<Integer> stream = list.stream(); 
        // stream.map(n -> n * n).forEach(System.out::println);

        // 4. collect
        // Scenario: Convert all elements to uppercase and collect them in a list
        // ArrayList<String> list = new ArrayList<>();
        // list.add("Apple");
        // list.add("Banana");
        // list.add("Cherry");
        // list.add("Dates");
        // list.add("Elderberry");

        // Stream<String> stream = list.stream();
        // List<String> result = stream.map(String::toUpperCase).collect(Collectors.toList());
        // System.out.println(result);

        // 5. reduce
        // Scenario: Find sum of all elements
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // Stream<Integer> stream = list.stream();
        // int result = stream.reduce(0, (a, b) -> a + b);
        // System.out.println(result);

        // 6. flatMap
        // Scenario: Convert list of list of integers to a single list of integers [[1, 2], [3, 4], [5, 6]] -> [1, 2, 3, 4, 5, 6]
        // ArrayList<List<Integer>> list = new ArrayList<>();                          
        // list.add(Arrays.asList(1, 2));
        // list.add(Arrays.asList(3, 4));
        // list.add(Arrays.asList(5, 6));

        // Stream<List<Integer>> stream = list.stream();
        // List<Integer> result = stream.flatMap(l -> l.stream()).collect(Collectors.toList());
        // System.out.println(result);

        // 7. sorted
        // Scenario: Sort elements in descending order
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(5);
        // list.add(3);
        // list.add(1);
        // list.add(4);
        // list.add(2);

        // Stream<Integer> stream = list.stream();
        // List<Integer> result = stream.sorted().collect(Collectors.toList());
        // System.out.println(result);

        // 8. distinct
        // Scenario: Remove duplicates from the list
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(1);
        // list.add(2);
        
        // Stream<Integer> stream = list.stream();
        // List<Integer> result = stream.distinct().collect(Collectors.toList());
        // System.out.println(result);

        // 9. limit
        // Scenario: Get first 3 elements from the list
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // Stream<Integer> stream = list.stream();
        // List<Integer> result = stream.limit(3).collect(Collectors.toList());
        // System.out.println(result);

        // 10. skip
        // Scenario: Skip first 3 elements from the list
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // Stream<Integer> stream = list.stream();
        // List<Integer> result = stream.skip(3).collect(Collectors.toList());
        // System.out.println(result);

        // 11. anyMatch
        // Scenario: Check if any element is greater than 5
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // Stream<Integer> stream = list.stream();
        // boolean result = stream.anyMatch(n -> n > 5);
        // System.out.println(result);

        // 12. allMatch
        // Scenario: Check if all elements are greater than 0
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // Stream<Integer> stream = list.stream();
        // boolean result = stream.allMatch(n -> n > 0);
        // System.out.println(result);

        // 13. noneMatch
        // Scenario: Check if no element is greater than 5
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // Stream<Integer> stream = list.stream();
        // boolean result = stream.noneMatch(n -> n > 5);
        // System.out.println(result);

        // 14. findFirst
        // Scenario: Find first element from the list
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // Stream<Integer> stream = list.stream();
        // Integer result = stream.findFirst().get();
        // System.out.println(result);

        // 15. findAny
        // Scenario: Find any element from the list
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // Stream<Integer> stream = list.stream();
        // Integer result = stream.findAny().get();
        // System.out.println(result);

        // 16. count
        // Scenario: Count number of elements in the list
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // Stream<Integer> stream = list.stream();
        // long result = stream.filter(n -> n > 3).count();
        // System.out.println(result);

        // 17. min
        // Scenario: Find minimum element from the list
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(5);
        // list.add(3);
        // list.add(1);
        // list.add(4);
        // list.add(2);

        // Stream<Integer> stream = list.stream();
        // Integer result = stream.min(Integer::compare).get();
        // System.out.println(result);

        // 18. max
        // Scenario: Find maximum element from the list
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(5);
        // list.add(3);
        // list.add(1);
        // list.add(4);
        // list.add(2);

        // Stream<Integer> stream = list.stream();
        // Integer result = stream.max(Integer::compare).get();
        // System.out.println(result);

        // 19. toArray
        // Scenario: Convert list to array
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // Stream<Integer> stream = list.stream();
        // Integer[] result = stream.toArray(Integer[]::new);
        // System.out.println(Arrays.toString(result));

        // 20. sum
        // Scenario: Find sum of all elements
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // Stream<Integer> stream = list.stream();
        // int result = stream.mapToInt(Integer::intValue).sum();
        // System.out.println(result);

        // 21. average
        // Scenario: Find average of all elements
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(4);

        // Stream<Integer> stream = list.stream();
        // double result = stream.mapToInt(Integer::intValue).average().getAsDouble();
        // System.out.println(result);
    }
}