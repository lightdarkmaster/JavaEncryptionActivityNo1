import java.util.Scanner;

public class InputToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        // Create an array to store the input values
        int[] inputArray = new int[numElements];

        // Collect input values and store them in the array
        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element #" + (i + 1) + ": ");
            inputArray[i] = scanner.nextInt();
        }

        // Display the elements stored in the array
        System.out.println("Elements stored in the array:");
        for (int i = 0; i < numElements; i++) {
            System.out.println("Element #" + (i + 1) + ": " + inputArray[i]);
        }

        scanner.close();
    }
}
