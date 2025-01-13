import java.util.Set;
import java.util.HashSet;

public class MyHashSet {

    public static void main(String[] args) {

        // Create a new HashSet of integers
        Set<Integer> om = new HashSet<>();

        // Add elements to the HashSet
        om.add(14);
        om.add(32);
        om.add(6);
        om.add(23);
        om.add(19);

        // Attempt to add a duplicate value (ignored by HashSet)
        om.add(19); // duplicate value is ignored

        // Print the HashSet (order is not guaranteed)
        System.out.println(om); // Example Output: [32, 6, 14, 19, 23]

        // Remove an element from the HashSet
        om.remove(23);

        // Print the HashSet after removal
        System.out.println(om); // Example Output: [32, 6, 14, 19]

        // Check if the HashSet contains specific elements
        System.out.println(om.contains(100)); // Output: false
        System.out.println(om.contains(19));  // Output: true

        // Get the size of the HashSet
        System.out.println(om.size()); // Output: 4

        // Check if the HashSet is empty
        System.out.println(om.isEmpty()); // Output: false

        // Clear the HashSet
        om.clear();

        // Print the HashSet after clearing
        System.out.println(om); // Output: []
    }
}
