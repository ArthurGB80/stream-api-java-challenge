package streamapi;

import java.util.Arrays;
import java.util.List;

public class Challenge6 {
    public static void main(String[] args) throws Exception {

        // Challenge 6 - Check if the list contains any number greater than 10:
        // Use the Stream API to check if the list contains any number greater than 10 and display the result in the console.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean moreThanTen = numbers.stream()
                .anyMatch(num -> num > 10);

        if (moreThanTen) {
            System.out.println("The list of numbers has at least one number greater than 10");
        } else {
            System.out.println("The list of numbers doesn't have any number greater than 10");
        }
    }
}