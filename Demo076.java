public class Demo076 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int secondMax = findSecondMax(arr);
        if (secondMax != Integer.MIN_VALUE) {
            System.out.println("The second maximum number in the array is: " + secondMax);
        } else {
            System.out.println("Array does not contain enough distinct numbers.");
        }
    }
    public static int findSecondMax(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max; 
                max = num; 
            } else if (num > secondMax && num != max) {
                secondMax = num; 
            }
        }
        return secondMax;
    }
}
