package desafio2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        // Desafio 2 - Imprima a soma dos números pares da lista:
        // Utilizando a Stream API, realize a soma dos números pares da lista e exiba o
        // resultado no console.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        int evenSum = numbers.stream()
                .filter(num -> num % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println(evenSum);

    }
}
