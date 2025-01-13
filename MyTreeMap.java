import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {

        // Create a new TreeMap
        Map<String, Integer> om = new TreeMap<>();

        // Add elements to the TreeMap
        om.put("BB", 2);
        om.put("AA", 1);
        om.put("DD", 4);
        om.put("CC", 3);

        // Print the TreeMap (keys are sorted in natural order)
        System.out.println(om); // Output: {AA=1, BB=2, CC=3, DD=4}

        // Remove an element with the key "DD"
        om.remove("DD");

        // Print the TreeMap after removal
        System.out.println(om); // Output: {AA=1, BB=2, CC=3}

        // Print the size of the TreeMap
        System.out.println(om.size()); // Output: 3

        // Additional methods

        // Check if a specific key is present
        System.out.println(om.containsKey("BB")); // Output: true
        System.out.println(om.containsKey("DD")); // Output: false

        // Check if a specific value is present
        System.out.println(om.containsValue(2)); // Output: true
        System.out.println(om.containsValue(4)); // Output: false

        // Get the value associated with a specific key
        System.out.println(om.get("AA")); // Output: 1

        // Print all keys
        System.out.println(om.keySet()); // Output: [AA, BB, CC]

        // Print all values
        System.out.println(om.values()); // Output: [1, 2, 3]

        // Clear the TreeMap
        om.clear();

        // Check if the TreeMap is empty
        System.out.println(om.isEmpty()); // Output: true
    }
}
