public class Demo079 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1, 7, 8, 56, 23};
        int target = 34;
        boolean isFound = isElementFound(arr, target);
        if (isFound) {
            System.out.println("Element " + target + " is found in the array.");
        } else {
            System.out.println("Element " + target + " is not found in the array.");
        }
    }
    public static boolean isElementFound(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true; 
            }
        }
        return false;     }
}
