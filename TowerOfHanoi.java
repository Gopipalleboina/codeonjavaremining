public class TowerOfHanoi {

    // Recursive function to solve the Tower of Hanoi problem
     static void solveHanoi(int n, char sourceRod, char auxiliaryRod, char destinationRod) {
        // Base case: if there's only one disk, move it directly from source to destination
        if (n == 1) {
            System.out.println("Move disk 1 from " + sourceRod + " to " + destinationRod);
            return;
        }
        
        // Step 1: Move the top n-1 disks from the source rod to the auxiliary rod
        solveHanoi(n - 1, sourceRod, destinationRod, auxiliaryRod);
        
        // Step 2: Move the nth disk (largest disk) from the source rod to the destination rod
        System.out.println("Move disk " + n + " from " + sourceRod + " to " + destinationRod);
        
        // Step 3: Move the n-1 disks from the auxiliary rod to the destination rod
        solveHanoi(n - 1, auxiliaryRod, sourceRod, destinationRod);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveHanoi(n,'A', 'B', 'C'); // A, B, C are the rods
    }
}
