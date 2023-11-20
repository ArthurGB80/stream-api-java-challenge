package streamapi;

import java.util.Arrays;
import java.util.List;

public class Challenge10 {
    public static void main(String[] args) throws Exception {

        // Challenge 10 - Group the odd values that are multiples of 3 or 5: 
        // Use the Stream API to group the odd values that are multiples of 3 or 5 and display the result in the console.
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> oddMultipleOf3and5 = numbers.stream()
                .filter(n -> n % 2 != 0 && ( n % 3 == 0 || n % 5 == 0))
                .toList();

            System.out.println(oddMultipleOf3and5);
        
    }
}
