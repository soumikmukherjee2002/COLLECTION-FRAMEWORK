import java.util.Map;
import java.util.HashMap;

public class MyHashMap {

    public static void main(String[] args) {

        // Create a new HashMap
        Map<String, Integer> om = new HashMap<>();

        // Add elements to the HashMap
        om.put("one", 1);
        om.put("two", 2);
        om.put("three", 3);
        om.put("four", 4);

        // Print the HashMap
        System.out.println(om); // Output: {one=1, two=2, three=3, four=4}

        // Update the value associated with the key "two"
        om.put("two", 22); // Update the value

        // Print the updated HashMap
        System.out.println(om); // Output: {one=1, two=22, three=3, four=4}

        // Add a new element if the key is not already present
        om.putIfAbsent("five", 5);

        // Print the HashMap after adding the new element
        System.out.println(om); // Output: {one=1, two=22, three=3, four=4, five=5}

        // Remove the element with the key "three"
        om.remove("three");

        // Print the HashMap after removal
        System.out.println(om); // Output: {one=1, two=22, four=4, five=5}

        // Check if a key is present in the HashMap
        System.out.println(om.containsKey("two")); // Output: true
        System.out.println(om.containsKey("three")); // Output: false

        // Check if a value is present in the HashMap
        System.out.println(om.containsValue(22)); // Output: true
        System.out.println(om.containsValue(3)); // Output: false

        // Iterate over the entries in the HashMap
        for (Map.Entry<String, Integer> entry : om.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Get the size of the HashMap
        System.out.println("Size: " + om.size()); // Output: 4

        // Check if the HashMap is empty
        System.out.println("Is Empty: " + om.isEmpty()); // Output: false

        // Clear the HashMap
        om.clear();

        // Print the HashMap after clearing
        System.out.println(om); // Output: {}
    }
}
