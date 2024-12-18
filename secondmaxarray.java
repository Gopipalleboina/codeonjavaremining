import java.util.Scanner;

public class secondmaxarray {
    public static void main(String[] args) {
        int[] a = {2,6,1,7,4,9};
        int max = a[0];
        int secondmax = Integer.MIN_VALUE;
        int min = a[0];

        for (int i = 1; i < a.length; i++) { // Start from index 1 since index 0 is already considered
            if (a[i] > max) {
                secondmax = max;
                max = a[i];
            } else if (a[i] > secondmax && a[i] < max) {
                secondmax = a[i];
            }
            
            // Correct logic for minimum number
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Second maximum number: " + secondmax);
        System.out.println("Minimum number: " + min);
    }
}
