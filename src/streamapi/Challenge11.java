package streamapi;

import java.util.Arrays;
import java.util.List;

public class Challenge11 {
    public static void main(String[] args) throws Exception {

        // Challenge 11 - Find the sum of the squares of all the numbers in the list:
        // Using the Stream API, find the sum of the squares of all the numbers in the list and display the result in the console.
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int sumOfSquares = numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(sumOfSquares);
    }
}