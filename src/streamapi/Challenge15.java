package streamapi;

import java.util.Arrays;
import java.util.List;

public class Challenge15 {
    public static void main(String[] args) throws Exception {

        // Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
        // Utilizando a Stream API, verifique se a lista contém pelo menos um número
        // negativo e exiba o resultado no console.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean haveNegIntegers = numbers.stream()
                .anyMatch(n -> n < 0);

        if (haveNegIntegers) {
            System.out.println("The list doesn't have any negative numbers");
        } else {
            System.out.println("The list has at least one negative number");
        }
    }
}