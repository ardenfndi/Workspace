package HashMap;

import java.util.HashMap;

/**
 * Code
 */
public class Code {

    public static void main(String[] args) {
        /*
            KEY - VALUE

            Berlin - Germany
            Paris - France
            Madrid - Spain
            Rome - Italy
            London - England
        */

        // Create a HashMap
        HashMap<String, String> countries = new HashMap<>();
        
        // Add elements to the HashMap
        countries.put("Berlin", "Germany");
        countries.put("Paris", "France");
        countries.put("Madrid", "Spain");
        countries.put("Rome", "Italy");
        countries.put("London", "England");

        // Print the HashMap
        System.out.println(countries);

        // Get the value of a key
        System.out.println(countries.get("Berlin"));

        // Check if a key exists
        System.out.println("Contains Key ==> " + countries.containsKey("Paris"));
        System.out.println("Contains Key ==> " + countries.containsKey("Tokyo"));

        // Check if a value exists
        System.out.println("Contains Value ==> " + countries.containsValue("Germany"));
        System.out.println("Contains Value ==> " + countries.containsValue("Japan"));

        // Remove a key
        countries.remove("London");
        System.out.println(countries);

        // Get the size of the HashMap
        System.out.println("Size ==> " + countries.size());

        // Clear the HashMap
        countries.clear();
        System.out.println(countries);

        // Check if the HashMap is empty
        System.out.println("Is Empty ==> " + countries.isEmpty());

        // How to iterate over a HashMap
        countries.put("Berlin", "Germany");
        countries.put("Paris", "France");
        countries.put("Madrid", "Spain");
        countries.put("Rome", "Italy");
        countries.put("London", "England");

        // 1. Using keySet()
        for (String key : countries.keySet()) {
            System.out.println("Key: " + key + " Value: " + countries.get(key));
        }

        // 2. Using entrySet()
        for (HashMap.Entry<String, String> entry : countries.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        // 3. Using forEach()
        countries.forEach((key, value) -> {
            System.out.println("Key: " + key + " Value: " + value);
        });

        

    }
}