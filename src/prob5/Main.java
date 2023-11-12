package prob5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        // Challenge 5 - Calculate the average of numbers greater than 5:
        // Using the Stream API, calculate the average of numbers greater than 5 and
        // display the result in the console.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double averageMoreThanFive = numbers.stream()
                .filter(num -> num >= 5)
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        System.out.println(averageMoreThanFive);
    }
}