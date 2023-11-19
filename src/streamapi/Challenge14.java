package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Challenge14 {
    public static void main(String[] args) throws Exception {

        // Desafio 14 - Encontre o maior número primo da lista:
        // Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maxPrimeNumber = numbers.stream()
            .filter(Challenge14::isPrime)
            .max(Comparator.naturalOrder());

        System.out.println(maxPrimeNumber.orElse(null));
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
            .noneMatch(i -> number % i == 0);
    }
}
