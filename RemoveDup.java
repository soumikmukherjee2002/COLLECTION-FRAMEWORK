import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Arrays;

public class RemoveDup {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 6, 7, 6, 5, 8, 8};

        int secondHighest = findSecondHighest(arr);
        System.out.println("The second highest element is: " + secondHighest);
    }
    public static int findSecondHighest(int[] arr) {
        // Use a TreeSet to remove duplicates and sort the elements
        Set<Integer> set = new TreeSet<>();

        // Add all elements from the array to the set-
        for (int num : arr) {
            set.add(num);
        }
        Iterator<Integer> itr= set.iterator();
        int[] sortedArr =new int[set.size()];
        int i=0;
        while(itr.hasNext()){
            sortedArr[i++]=itr.next();
        }
        // Convert the set to an array
        //Integer[] sortedArray = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(sortedArr));

        return sortedArr[sortedArr.length - 2];
    }
}
