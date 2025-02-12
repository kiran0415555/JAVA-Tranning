public class Demo082 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println("Merged Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int index = 0;
        for (int num : arr1) {
            merged[index++] = num;
        }
        for (int num : arr2) {
            merged[index++] = num;
        }
        return merged;
    }
}
