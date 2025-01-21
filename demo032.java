import java.util.HashSet;

public class demo032 {
    public static void main(String[] args) {
        // Create a HashSet to store homogeneous string values
        HashSet<String> stringHashSet = new HashSet<>();

        // Add string elements to the HashSet
        stringHashSet.add("Apple");
        stringHashSet.add("Banana");
        stringHashSet.add("Cherry");
        stringHashSet.add("Date");
        stringHashSet.add("Elderberry");

        // Attempt to add duplicate elements (will not be added)
        stringHashSet.add("Apple");
        stringHashSet.add("Banana");

        // Display the contents of the HashSet
        System.out.println("HashSet contents:");
        for (String element : stringHashSet) {
            System.out.println(element);
        }

        // Check if a specific element exists
        String searchElement = "Cherry";
        if (stringHashSet.contains(searchElement)) {
            System.out.println(searchElement + " exists in the HashSet.");
        } else {
            System.out.println(searchElement + " does not exist in the HashSet.");
        }

        // Remove an element from the HashSet
        stringHashSet.remove("Date");
        System.out.println("After removing 'Date': " + stringHashSet);
    }
}
