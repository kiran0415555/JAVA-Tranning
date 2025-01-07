import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the sides of the triangle
        System.out.print("Enter the length of the first side: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of the second side: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of the third side: ");
        double c = scanner.nextDouble();

        // Check if the inputs can form a triangle
        if (a + b > c && a + c > b && b + c > a) {
            // Calculate the semi-perimeter
            double s = (a + b + c) / 2;

            // Calculate the area using Heron's formula
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            // Display the result
            System.out.printf("The area of the triangle is %.2f%n", area);
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        // Close the scanner
        scanner.close();
    }
}