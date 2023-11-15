package streamapi;

import java.util.Arrays;
import java.util.List;

public class Challenge12 {
    public static void main(String[] args) throws Exception {

        // Challenge 12 - Find the product of all the numbers in the list:
        // With the help of the Stream API, find the product of all the numbers in the list and display the result in the console.        

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int productOfAllNumbers = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println(productOfAllNumbers);
    }
}
