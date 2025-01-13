import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyCollectionsClass {
    public static void main(String[] args) {

        // Create a new ArrayList
        List<Integer> om = new ArrayList<>();

        // Add elements to the list
        om.add(22);
        om.add(14);
        om.add(17);
        om.add(17);
        om.add(12);
        om.add(11);

        // Sort the list
        Collections.sort(om);
        System.out.println("Sorted List: " + om);

        // Find the minimum element
        System.out.println("Minimum Element: " + Collections.min(om));

        // Find the maximum element
        System.out.println("Maximum Element: " + Collections.max(om));

        // Find the frequency/count  of an element
        System.out.println("Count of 17: " + Collections.frequency(om, 17));

        // Reverse the list
        Collections.reverse(om);
        System.out.println("Reversed List: " + om);

        // Shuffle the list
        Collections.shuffle(om);
        System.out.println("Shuffled List: " + om);


        // Copy the list to a new list
        List<Integer> copiedList = new ArrayList<>(om);
        System.out.println("Copied List: " + copiedList);
    }
}
