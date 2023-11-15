package streamapi;

import java.util.Arrays;
import java.util.List;

public class Challenge13 {
    public static void main(String[] args) throws Exception {

        // Challenge 13 - Filter the numbers that are within a specific range:
        // Use the Stream API to filter the numbers that are within a specific range (for example, between 5 and 10) and display the result in the console.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> intervalList = numbers.stream()
                .filter(n -> n >= 3 && n <= 9)
                .toList();

        System.out.println(intervalList);
    }
}