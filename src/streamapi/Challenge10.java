package streamapi;

import java.util.Arrays;
import java.util.List;

public class Challenge10 {
    public static void main(String[] args) throws Exception {

        // Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
        // Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> oddMultipleOf3and5 = numbers.stream()
                .filter(n -> n % 2 != 0 && ( n % 3 == 0 || n % 5 == 0))
                .toList();

            System.out.println(oddMultipleOf3and5);
        
    }
}
