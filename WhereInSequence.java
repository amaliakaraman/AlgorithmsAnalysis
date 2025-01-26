// Name: Amalia Karaman
// Assignment: Algorithms Analysis
// Professor: Esteban Parra Rodriguez
// This program finds the position of a number in the NotFibonacci sequence.

public class WhereInSequence {
    public static void main(String[] args) {
        int input = 8; // Input value to find
        int position = findPositionInNotFibonacci(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + position);
    }
    public static int findPositionInNotFibonacci(int num) {
        if (num < 0) {
            return -1; // Invalid input
        }
        long[] sequence = generateNotFibonacci(100); // Generates up to 100 terms
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == num) {
                return i + 1; //  Match (i)
            } else if (sequence[i] > num) {
                return i + 1; // Closest lower match (i)
            }
        }
        return -1; // Number exceeds sequence
    }
    public static long[] generateNotFibonacci(int n) {
        if (n <= 0) {
            return new long[0]; // Invalid input
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
