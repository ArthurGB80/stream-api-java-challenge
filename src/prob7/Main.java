package prob7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        // Challenge 7 - Find the second largest number in the list:
        // With the help of the Stream API, find the second largest number in the list and display the result in the console.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer secondGraterNumber = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

            System.out.println("The second number grater in the list is: " + secondGraterNumber);
    }
}   