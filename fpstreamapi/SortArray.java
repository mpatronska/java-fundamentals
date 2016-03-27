package org.softuni.homework.fpstreamapi;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by mpatronska on 3/27/2016.
 */
public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbersInput = sc.nextLine();
        String sortingOrderInput = sc.nextLine();

        String[] numbers = numbersInput.split(" ");

        if ("Ascending".equalsIgnoreCase(sortingOrderInput)) {
            Arrays.stream(numbers).map(Integer::parseInt).sorted((number1, number2) -> Integer.compare(number1, number2)).
                    collect(Collectors.toList()).forEach(number ->
                System.out.print(number + " "));

         } else if ("Descending".equalsIgnoreCase(sortingOrderInput)) {
            Arrays.stream(numbers).map(Integer::parseInt).sorted((number1, number2) -> Integer.compare(number2, number1)).
                    collect(Collectors.toList()).forEach(number ->
                System.out.print(number + " "));
        }
    }
}
