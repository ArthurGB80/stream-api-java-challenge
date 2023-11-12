package prob2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        // Challenge 2 - Print the sum of the even numbers in the list:
        // Using the Stream API, calculate the sum of the even numbers in the list and display
        // the result in the console.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        int evenSum = numbers.stream()
                .filter(num -> num % 2 == 0)  // Filter out odd numbers
                .reduce(0, Integer::sum);     // Sum up the remaining even numbers

        System.out.println("The sum of the even numbers in the list is: " + evenSum);
    }
}