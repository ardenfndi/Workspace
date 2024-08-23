package Q1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;


public class Main {
    public static void main(String[] args){
        List<Person> people = Arrays.asList(
            new Person("John", 28, "New York", Arrays.asList("Reading", "Cooking")),
            new Person("Alice", 34, "Los Angeles", Arrays.asList("Travelling", "Cooking")),
            new Person("Bob", 23, "Chicago", Arrays.asList("Reading", "Travelling")),
            new Person("David", 28, "New York", Arrays.asList("Cooking", "Travelling")),
            new Person("Jane", 40, "Los Angeles", Arrays.asList("Reading", "Travelling")),
            new Person("Emma", 22, "Chicago", Arrays.asList("Reading", "Cooking")),
            new Person("Sophia", 29, "New York", Arrays.asList("Reading", "Travelling"))
        );

        // 1
        // ArrayList<String> list = new ArrayList<>();
        // people.stream().forEach(person -> System.out.println(person.getName()));

        // --------------------------------------------------------------------------

        // 2
        // List<Person> list = people.stream()
        //         .filter(person -> "New York".equals(person.getCity()))
        //         .collect(Collectors.toList());
        //         System.out.println(list);

        // --------------------------------------------------------------------------

        // 3
        // List<String> names = people.stream().map(Person::getName).collect(Collectors.toList());
        // names.forEach(System.out::println);

        // --------------------------------------------------------------------------

        // 4
        // List<Person> list = people.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());
        // list.forEach(System.out::println);
        
        // --------------------------------------------------------------------------

        // 5
        // int result = people.stream().reduce(0, (idy, person) -> idy + person.getAge(), Integer::sum);
        // System.out.println(result);

        // --------------------------------------------------------------------------

        // 6
        // people.stream().flatMap(peoples -> peoples.getHobbies().stream()).collect((Collectors.toList())).forEach(System.out::println);
        
        // --------------------------------------------------------------------------

        // people.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

        // 8
        // people.stream().distinct().forEach(System.out::println);

        // --------------------------------------------------------------------------

        // 9
        // people.stream().limit(3).forEach(System.out::println);
        
        // --------------------------------------------------------------------------

        // 10
        // people.stream().skip(2).forEach(System.out::println);

        // --------------------------------------------------------------------------

        // 11
        // boolean anyInChicago = people.stream().anyMatch(peoples -> "Chicago".equals(peoples.getCity()));
        // System.out.println(anyInChicago);

        // --------------------------------------------------------------------------
        
        // 12
        // boolean allOlderThan18 = people.stream().anyMatch(peoples -> peoples.getAge() > 18);
        // System.out.println(allOlderThan18);

        // --------------------------------------------------------------------------

        // 13
        // boolean noneInBoston = people.stream().noneMatch(peoples -> "Boston".equals(peoples.getCity()));
        // System.out.println(noneInBoston);

        // --------------------------------------------------------------------------

        // 14
        // Person olderThank25 = people.stream().filter(peoples -> peoples.getAge() > 25).findFirst().get();
        // System.out.println(olderThank25);
        
        // --------------------------------------------------------------------------

        // 15
        // Person anyInLA = people.stream().filter(peoples -> "Los Angeles".equals(peoples.getCity())).findAny().get();
        // System.out.println(anyInLA);
        
        // --------------------------------------------------------------------------

        // 16
        // long countInNY = people.stream().filter(peoples -> "New York".equals(peoples.getCity())).count();
        // System.out.println(countInNY);

        // --------------------------------------------------------------------------

        // 17
        // Person minAgePerson = people.stream().min(Comparator.comparingInt(Person::getAge)).get();
        // System.out.println(minAgePerson);

        // --------------------------------------------------------------------------
        
        // 18
        // Person maxAgePerson = people.stream().max(Comparator.comparingInt(Person::getAge)).get();
        // System.out.println(maxAgePerson);
        
        // --------------------------------------------------------------------------

        // 19
        // Person[] result = people.stream().toArray(Person[]::new);
        // System.out.println(Arrays.toString(result));
    
        // --------------------------------------------------------------------------
        
        // 20
        // int sumOfAges = people.stream().mapToInt(Person::getAge).sum();
        // System.out.println(sumOfAges);

        // --------------------------------------------------------------------------

        // 21
        // double averageAge = people.stream().mapToInt(Person::getAge).average().getAsDouble();
        // System.out.println(averageAge);

    
    
    
    
    
    
    
    
    }

    
}
