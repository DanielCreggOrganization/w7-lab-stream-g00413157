package ie.atu.streamlab;

import java.util.Arrays;
import java.util.List;

public class excersiseFour {
 public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using lambda
        names.stream()
             .map(name -> name.toUpperCase())
             .forEach(name -> System.out.println(name));

        // Using method references
        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
