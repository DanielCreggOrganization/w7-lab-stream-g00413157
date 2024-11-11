package ie.atu.streamlab;
 

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class excersiseThree {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("apple", "banana", "grape", "kiwi","orange","mango");
    
            List<String> filteredNames = names.stream()
                                            .filter(name -> name.length() > 4)
                                            .sorted()
                                          
                                            .map(name-> name.toLowerCase())
                                            .collect(Collectors.toList());
                                        
            filteredNames.forEach(name -> System.out.println(name));
    }
    
    
}
