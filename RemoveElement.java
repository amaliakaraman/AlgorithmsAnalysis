import java.util.Arrays;
// Name: Amalia Karaman
// Assignment: Algorithms Analysis
// Professor: Esteban Parra Rodriguez
// This program removes a specified value from an array.

public class RemoveElement {
    public static void main(String[] args) {
        int[] inputArray = {3, 2, 2, 3}; // Example
        int val = 3; // Value to remove
        int result = removeElement(inputArray, val);
        System.out.println("INPUT: " + Arrays.toString(inputArray) + ", val = " + val);
        System.out.println("OUTPUT: " + result);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOf(inputArray, result)));
    }
    public static int removeElement(int[] inputArray, int val) {
        int k = 0; // Valid element pointer
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != val) {
                inputArray[k++] = inputArray[i];
            }
        }
        return k; // Count of valid elements
    }
}
