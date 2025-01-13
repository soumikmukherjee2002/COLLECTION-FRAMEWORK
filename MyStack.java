import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {

        // Create a new stack of strings
        Stack<String> om = new Stack<>();

        // Push elements onto the stack
        om.push("ab");
        om.push("cd");
        om.push("ef");
        om.push("gh");
        om.push("ij");

        // Print the stack
        System.out.println(om);  // Output: [ab, cd, ef, gh, ij]

        // Show the topmost element
        System.out.println(om.peek());  // Output: ij

        // Remove the topmost element
        om.pop();

        // Print the stack again after popping the top element
        System.out.println(om);  // Output: [ab, cd, ef, gh]
    }
}
