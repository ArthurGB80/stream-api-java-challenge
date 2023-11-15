package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge1 {
    public static void main(String[] args) throws Exception {

        // Challenge 1 - Display the list in numerical order:
        // Create a program that uses the Stream API to sort the list of numbers in ascending order and display it on the console.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> sortedList = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);

    }
}
