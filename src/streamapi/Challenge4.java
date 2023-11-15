package streamapi;

import java.util.Arrays;
import java.util.List;

public class Challenge4 {
    public static void main(String[] args) throws Exception {

        // Challenge 4 - Remove all odd values:
        // Use the Stream API to remove all odd values from the list and print the
        // resulting list in the console.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // My answer
        List<Integer> evenList = numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();

        System.out.println("The list of even numbers is: " + evenList);
    }
}