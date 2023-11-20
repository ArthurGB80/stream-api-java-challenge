package streamapi;

import java.util.Arrays;
import java.util.List;

public class Challenge16 {
    public static void main(String[] args) throws Exception {

        // Challenge 16 - Group the numbers into evens and odds: 
        // Use the Stream API to group the numbers into two separate lists, one containing the even numbers and the other containing the odd numbers from the original list, and display the results in the console.
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> evenList = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        List<Integer> oddList = numbers.stream()
                .filter(n -> n % 2 != 0)
                .toList();
                
        System.out.println(evenList);
        System.out.println(oddList);
                
    }
}