
package ie.atu.streamlab;

import java.util.Arrays;
import java.util.List;

public class excersiseFive {
    public static void main(String[] args) {
        // Example 1: Sum numbers using reduce
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        // Sum using reduce
        int sum = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Sum: " + sum); // Output: Sum: 15

        // Example 2: Find maximum number
        int max = numbers.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> Math.min(a, b));
        System.out.println("Minimum value: " + max); // Output: Max value: 5

    }
}
