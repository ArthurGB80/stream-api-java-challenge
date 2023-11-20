package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Challenge17 {
    public static void main(String[] args) throws Exception {

        // Challenge 17 - Filter the prime numbers from the list: 
        // With the help of the Stream API, filter the prime numbers from the list and display the result in the console.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> PrimeNumbers = numbers.stream()
                .filter(Challenge17::isPrime)
                .toList();

        System.out.println(PrimeNumbers);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(i -> number % i == 0);
    }
}