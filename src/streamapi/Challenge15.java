package streamapi;

import java.util.Arrays;
import java.util.List;

public class Challenge15 {
    public static void main(String[] args) throws Exception {

        // Challenge 15 - Check if the list contains at least one negative number: 
        // Using the Stream API, check if the list contains at least one negative number and display the result in the console.
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean haveNegIntegers = numbers.stream()
                .anyMatch(n -> n < 0);

        if (haveNegIntegers) {
            System.out.println("The list doesn't have any negative numbers");
        } else {
            System.out.println("The list has at least one negative number");
        }
    }
}