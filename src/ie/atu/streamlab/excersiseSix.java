package ie.atu.streamlab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class excersiseSix {

       public static void main(String[] args) {
        String inputPath = "resources/input.txt";

        try (Stream<String> lines = Files.lines(Paths.get(inputPath))) {
            lines.filter(line -> line.contains("file"))
                 .map(String::trim)
                 .forEach(line -> System.out.println(line));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
