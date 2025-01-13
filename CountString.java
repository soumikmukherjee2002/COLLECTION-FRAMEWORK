import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountString {

    public static void main(String[] args) {

        String str = "aaabbcccd";

        char[] arr = str.toCharArray();

        Pass(arr);
    }

    public static void Pass(char[] arr) {

        // Use an ArrayList to store the characters
        List<Character> om = new ArrayList<>();

        // Add characters to the ArrayList
        for (char a : arr) {
            om.add(a);
        }

        // StringBuilder to build the output string
        StringBuilder result = new StringBuilder();

        // Create an ArrayList to keep track of processed characters
        List<Character> processed = new ArrayList<>();

        // Iterate over the ArrayList and count the frequency of each character
        for (char a : om) {
            if (!processed.contains(a)) {
                int frequency = Collections.frequency(om, a);
                result.append(a).append(frequency);
                processed.add(a);
            }
        }

        // Print the final result
        System.out.println(result.toString());
    }
}
