import java.util.Scanner;

class Parent {
    // Base class (empty in this example)
}

class Child extends Parent {
    
    public void fun(int N) {
        // Convert the number into an array of digits
        int[] digits = new int[5]; // Assuming N is at most 5 digits (as per 100 ≤ N ≤ 104)
        int count = 0;
        
        while (N > 0) {
            digits[count] = N % 10;
            N = N / 10;
            count++;
        }

        int sum = 0;

        // Calculate the sum of all possible pairs of digits
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                sum += digits[i] + digits[j];
            }
        }

        // Print the final sum
        System.out.println(sum);
    }
}

public class  sumofdigitsusingarray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        Child child = new Child();
        child.fun(N);
        
        scanner.close();
    }
}
