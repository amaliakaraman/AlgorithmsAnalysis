// Name: Amalia Karaman
// Assignment: Algorithms Analysis
// Professor: Esteban Parra Rodriguez
// This program generates the NotFibonacci sequence.

public class NotFibonacci {
    public static void main(String[] args) {
        int n = 10; // Example input
        long[] sequence = generateNotFibonacci(n); // Generates the NotFibonacci sequence
        System.out.print("NotFibonacci sequence: "); // Prints sequence
        for (long num : sequence) {
            System.out.print(num + " ");
        }
    }
    public static long[] generateNotFibonacci(int n) { // Generates the NotFibonacci sequence
        if (n <= 0) {
            return new long[0]; // Returns empty arrays for invalid inputs
        }
        long[] sequence = new long[n];
        sequence[0] = 0;
        if (n > 1) {
            sequence[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            sequence[i] = 3 * sequence[i - 1] + 2 * sequence[i - 2];
        }
        return sequence;
    }
}
