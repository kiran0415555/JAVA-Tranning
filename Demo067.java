import java.util.Scanner;

public class Demo067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        // Taking input for array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Printing even elements
        System.out.println("Even elements in the array: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        
        scanner.close();
    }
}