public class Demo078 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1, 7, 8, 56, 23};
        arrangeEvenOdd(arr);
    }
    public static void arrangeEvenOdd(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int left = 0;  
        int right = n - 1; 
        for (int num : arr) {
            if (num % 2 == 0) {
                result[left++] = num; 
            } else {
                result[right--] = num;
            }
        }
        System.out.println("Array with even numbers on the left and odd numbers on the right:");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
