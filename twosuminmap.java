import java.util.*;

public class twosuminmap {
    public static void main(String[] args) {
        // Initialize the HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();
        int[] ar = new int[n];

        // Read the elements and store them in the array and HashMap
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            ar[i] = ele;
            hm.put(ele, i); // Store element as key and index as value
        }

        // Read the target sum
        int m = sc.nextInt();

        // Find two numbers that sum to the target
        for (int i = 0; i < n; i++) {
            int rem = m - ar[i]; // Calculate the remainder

            // Check if the remainder exists in the HashMap
            if (hm.containsKey(rem) && hm.get(rem) != i) {//Check if 7 is in the HashMap (hm.containsKey(7)). It is, and its value is 1 (index of 7 in the array).
              //  Check if hm.get(7) != 0 (i.e., 1 != 0). It is true because index 1 (where 7 is found) is not the same as index 0.
               // Since both conditions are met, it means that 2 (at index 0) and 7 (at index 1) add up to the target sum 9.
                System.out.println(i+" "+hm.get(rem));
                return; // Exit after finding the first valid pair
            }
        }

        System.out.println("No valid pair found");
    }
}
