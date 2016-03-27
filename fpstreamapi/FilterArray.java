package org.softuni.homework.fpstreamapi;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by mpatronska on 3/27/2016.
 */
public class FilterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] elements = input.split(" ");

        Arrays.stream(elements).filter(FilterArray::isMoreThanThreeCharactersLength).collect(Collectors.toList()).
                forEach(element -> System.out.print(element + " "));
    }

    /**
     * Check if the length od the string is more than 3 characters.
     *
     * @param element the given string element
     * @return true if the length > 3, false - otherwise.
     */
    private static boolean isMoreThanThreeCharactersLength(String element) {
        return element.length() > 3;
    }
}
