package prob3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        // Challenge 3 - Check if all numbers in the list are positive:
        // With the help of the Stream API, verify if all numbers in the list are
        // positive and display the result in the console.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // My answer
        List<Integer> positiveList = numbers.stream()
                .filter(num -> num > 0)
                .toList();

        if (positiveList.equals(numbers)) {
            System.out.println("This list has only positive numbers");
        } else {
            System.out.println("This list doesn't have only positive numbers");
        }

        // AI answer
        boolean allPositive = numbers.stream()
                .allMatch(num -> num > 0);

        if (allPositive) {
            System.out.println("This list has only positive numbers");
        } else {
            System.out.println("This list doesn't have only positive numbers");
        }
    }
}