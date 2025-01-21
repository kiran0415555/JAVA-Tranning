import java.util.HashSet;

public class demo031 {
    public static void main(String[] args) {
        // Create a HashSet to store homogeneous string values
        HashSet<String> stringSet = new HashSet<>();

        // Adding strings to the HashSet
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Date");
        stringSet.add("Elderberry");

        // Attempting to add a duplicate value
        boolean isAdded = stringSet.add("Apple");
        if (!isAdded) {
            System.out.println("Duplicate value 'Apple' not added.");
        }

        // Display the contents of the HashSet
        System.out.println("HashSet Contents: " + stringSet);

        // Check if a specific value exists
        if (stringSet.contains("Banana")) {
            System.out.println("HashSet contains 'Banana'.");
        }

        // Remove a value from the HashSet
        stringSet.remove("Cherry");
        System.out.println("After removing 'Cherry': " + stringSet);

        // Iterate through the HashSet
        System.out.println("Iterating through HashSet:");
        for (String value : stringSet) {
            System.out.println(value);
        }
    }
}
