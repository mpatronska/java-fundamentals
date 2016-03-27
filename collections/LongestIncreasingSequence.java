package org.softuni.homework.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mpatronska on 3/26/2016.
 */
public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] strings = input.split(" ");

        int[] numbers = new int[strings.length];

        for (int i = 0; i < strings.length; i ++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }

        int endPosition = 0;
        int count = 0;
        int longestCount = 0;

        for (int i = 0; i < numbers.length - 1; i ++) {
            count ++;

            System.out.print(numbers[i] + " ");

            if (count > longestCount) {
                longestCount = count;
                endPosition = i;

            }

            if (i == numbers.length - 2 && numbers[i] < numbers[i+1]) {
                count ++;
                System.out.print(numbers[i+1] + " ");

                if (count > longestCount) {
                    longestCount = count;
                    endPosition = i + 1;
                }
            }
            if (numbers[i] >= numbers[i+1]) {
                System.out.println();

                if (i == numbers.length - 2) {
                    System.out.println(numbers[i+1] + " ");
                }
                if (longestCount < count) {
                    longestCount = count;
                    endPosition = i;
                    //count = 0;
                }
                count = 0;

            }
        }

        System.out.println();
        System.out.print("Longest: ");
        for (int i = endPosition - longestCount + 1; i <= endPosition; i ++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
