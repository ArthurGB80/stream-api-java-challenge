package desafio2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {

        // Desafio 2 - Imprima a soma dos números pares da lista:
        // Utilizando a Stream API, realize a soma dos números pares da lista e exiba o
        // resultado no console.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> evenList = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenList);

        int evenListSum = evenList.stream()
                .reduce(0, Integer::sum);
        System.out.println(evenListSum);

    }
}
