package streamapi;

import java.util.Arrays;
import java.util.List;

public class Challenge9 {
    public static void main(String[] args) throws Exception {

        // Challenge 9 - Check if all numbers in the list are distinct (do not repeat):
        // Using the Stream API, check if all numbers in the list are distinct (do not repeat) and display the result in the console.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        long countOfDistinctNumbers = numbers.stream()
                .distinct()
                .count();

        if (numbers.size() == countOfDistinctNumbers) {
            System.out.println("This numbers list are distinct.");
        } else {
            System.out.println("The numbers list has repeted element.");
        }
    }
}
