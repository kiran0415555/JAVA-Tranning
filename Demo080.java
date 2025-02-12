public class Demo080 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        shiftLeft(arr);
        System.out.println("\nArray after shifting elements to the left:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void shiftLeft(int[] arr) {
        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
    }
}
