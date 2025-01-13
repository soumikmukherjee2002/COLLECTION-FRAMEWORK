import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {

        // Create a new queue of integers using LinkedList
        Queue<Integer> om = new LinkedList<>();

        // Add elements to the queue
        om.offer(10); // offer == add
        om.offer(20);
        om.offer(30);
        om.offer(40);

        // Print the queue
        System.out.println(om);  // Output: [10, 20, 30, 40]

        // Show the front element of the queue
        System.out.println(om.peek());  // Output: 10

        // Remove the front element from the queue
        om.poll();

        // Print the queue again after removing the front element
        System.out.println(om);  // Output: [20, 30, 40]
    }
}
