import java.util.Scanner;

public class demo018 {
    public static void main(String[] args) {
        // Constants
        final int MINUTES_IN_AN_HOUR = 60;
        final int HOURS_IN_A_DAY = 24;
        final int DAYS_IN_A_YEAR = 365;

        // Input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        // Conversion calculations
        long totalDays = minutes / (MINUTES_IN_AN_HOUR * HOURS_IN_A_DAY);
        long years = totalDays / DAYS_IN_A_YEAR;
        long remainingDays = totalDays % DAYS_IN_A_YEAR;

        // Output the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");
        
        scanner.close();
    }
}
