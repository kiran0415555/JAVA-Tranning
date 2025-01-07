import java.util.Scanner;

public class demo14{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Display original values
        System.out.println("\nBefore swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Swap numbers using a third variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Display swapped values
        System.out.println("\nAfter swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Close the scanner
        scanner.close();
    }
}