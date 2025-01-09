public class demo019 {

    public static void main(String[] args) {
        int numberOfTerms = 10; // Example: Generate 10 terms
        int[] fibonacciTerms = getFibonacciSequence(numberOfTerms);

        // Print the Fibonacci sequence
        for (int term : fibonacciTerms) {
            System.out.print(term + " ");
        }
    }

    /**
     * Generates the first n terms of the Fibonacci sequence.
     *
     * @param n the number of terms to generate
     * @return an array containing the Fibonacci sequence
     */
    public static int[] getFibonacciSequence(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Number of terms must be greater than zero.");
        }

        int[] fibonacci = new int[n];
        if (n >= 1) {
            fibonacci[0] = 0; // First term
        }
        if (n >= 2) {
            fibonacci[1] = 1; // Second term
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }
}
