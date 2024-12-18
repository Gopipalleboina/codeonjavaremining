
import java.util.Scanner;

class Box {
    double width, height, depth;

    // Constructor to initialize the dimensions of the box
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate the volume of the box
    double calculateVolume() {
        return width * height * depth;
    }
}

public class volume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the dimensions of the box
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        double depth = scanner.nextDouble();

        // Creating an instance of the Box class
        Box box = new Box(width, height, depth);

        // Calculating the volume
        double volume = box.calculateVolume();

        // Printing the volume rounded to two decimal places
        System.out.printf("Volume: %.2f\n", volume);
    }
}
