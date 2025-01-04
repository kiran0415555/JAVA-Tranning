import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();


        System.out.println("\n--- Person Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);

        scanner.close();
    }
}
