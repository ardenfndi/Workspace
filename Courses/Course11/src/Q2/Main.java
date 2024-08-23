package Q2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 30, 55000, "Engineering"),
            new Employee(2, "Bob", 35, 60000, "HR"),
            new Employee(3, "Charlie", 40, 70000, "Marketing"),
            new Employee(4, "David", 25, 50000, "Engineering"),
            new Employee(5, "Eve", 28, 40000, "HR"),
            new Employee(6, "Frank", 50, 90000, "Marketing"),
            new Employee(7, "Grace", 45, 80000, "Engineering")
        );

        // 1
        // employees.forEach(System.out::println);

        // 2
        // employees.stream().filter(e -> e.getDepartment().equals("HR") && e.getAge() > 30).forEach(System.out::println);

        // 3
        // List<String> nameUpperCase = employees.stream().map(e -> e.getName().toUpperCase()).collect(Collectors.toList());
        // System.out.println(nameUpperCase);

        // 4
        // List<String> earnMore = employees.stream().filter(e -> e.getSalary() > 50000).map(Employee::getName).collect(Collectors.toList());
        // System.out.println(earnMore);

        // 5
        // double sum = employees.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
        // System.out.println(sum);

        // 6
        // List<List<String>> departmentTeams = Arrays.asList(
        //     Arrays.asList("Team A1", "Team A2"),
        //     Arrays.asList("Team B1", "Team B2"),
        //     Arrays.asList("Team C1", "Team C2")
        // );
        // departmentTeams.stream().flatMap(Collection::stream).distinct().forEach(System.out::println);
    
        // 7
        // employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);

        // 8
        // employees.stream().map(Employee::getName).distinct().forEach(System.out::println);
        
        // 9
        // employees.stream()
        //     .sorted(Comparator.comparingInt(Employee::getAge).reversed())
        //     .limit(5)
        //     .forEach(System.out::println);
        
        // 10
        // employees.stream()
        //         .sorted(Comparator.comparingInt(Employee::getId))
        //         .skip(3)
        //         .forEach(System.out::println);

        // 11
        // boolean moreThan = employees.stream()
        // .anyMatch(e -> e.getSalary() > 100000);
        // System.out.println(moreThan);

        // 12
        // boolean allMatch = employees.stream()
        //     .allMatch(e -> e.getAge() >= 18);
        //     System.out.println(allMatch);

        // 13
        // boolean noneMatch = employees.stream()
        //         .noneMatch(e -> e.getAge() < 18);
        //         System.out.println(noneMatch);

        // 14
        // Optional<Employee> emOptional = employees.stream()
        //         .filter(e -> e.getDepartment().equals("Engineering"))
        //         .findFirst();
        
        // if(emOptional.isPresent()){
        //     System.out.println(emOptional.get());
        // } else {
        //     System.out.println("No employee found");
        // }

        // 15
        // Optional<Employee> olderThan40 = employees.stream()
        //         .filter(e -> e.getAge() > 40)
        //         .findAny();

        // if(olderThan40.isPresent()){
        //     System.out.println(olderThan40.get());
        // } else {
        //     System.out.println("No employee found");
        // }

        // 16
        // long count = employees.stream()
        //         .filter(e -> e.getDepartment().equals("Marketing"))
        //         .count();
        //         System.out.println(count);

        // 17
        // Optional<Employee> min = employees.stream()
        //         .min(Comparator.comparingDouble(Employee::getSalary));
        //         System.out.println(min);

        // 18
        // Optional<Employee> max = employees.stream()
        //         .max(Comparator.comparingDouble(Employee::getSalary));
        //         System.out.println(max);

        // 19
        // String[] names = employees.stream()
        //         .map(Employee::getName).toArray(String[]::new);
        // System.out.println(Arrays.toString(names));

        // 20
        // int sum = employees.stream().mapToInt(Employee::getAge).sum();
        // System.out.println(sum);

        // 21
        // OptionalDouble avarage = employees.stream()
        //         .mapToDouble(Employee::getSalary).average();
        //         System.out.println(avarage);
    
    
    
    
    }
}
