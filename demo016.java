import java.util.Scanner;

public class demo016 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the string is a palindrome
        boolean isPalindrome = isPalindrome(input);

        // Display the result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase and remove non-alphanumeric characters
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Initialize pointers for the start and end of the string
        int start = 0;
        int end = str.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
