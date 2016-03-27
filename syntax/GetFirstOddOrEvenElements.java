package org.softuni.homework.syntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mpatronska on 3/19/2016.
 */
public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();
        String format = sc.nextLine();

        List<Integer> result = getFirstOddOrEvenElements(numbers, format);
        for (Integer element : result) {
            System.out.print(element + " ");
        }


    }

    private static List<Integer>  getFirstOddOrEvenElements(String numbers, String format) {
        String[] array = numbers.split(" ");
        int[] numbs = new int[array.length];
        for (int i = 0; i < array.length; i ++) {
            numbs[i] = Integer.parseInt(array[i]);

        }

        int count = Integer.parseInt(format.split(" ")[1]);
        String type = format.split(" ")[2];

        List<Integer> result = new ArrayList<>();

        int index = 0;
        for (int i = 0; i < numbs.length; i ++) {
            if (type.equals("odd")) {
                if (numbs[i] % 2 != 0) {
                    if (index <= count) {
                        result.add(numbs[i]);

                        index++;
                    } else {
                        break;
                    }
                }
            } else if (type.equals("even")) {
                if (numbs[i] % 2 == 0) {
                    if (index <= count) {
                        result.add(numbs[i]);
                        index++;
                    } else {
                        break;
                    }
                }
            }
        }

        return result;
    }
}
