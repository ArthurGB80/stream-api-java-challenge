package streamapi;

import java.util.Arrays;
import java.util.List;

public class Challenge8 {
    public static void main(String[] args) throws Exception {

        // Challenge 8 - Sum the digits of all the numbers in the list:
        // Using the Stream API, sum the digits of all the numbers in the list and display the result in the console.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int sumAllDigits = numbers.stream()
            .map(num -> num.toString().chars().map(Character::getNumericValue).sum())
            .mapToInt(Integer::intValue)
            .sum();

        System.out.println("The sum of all digits in the list is: " + sumAllDigits);
    }
}

