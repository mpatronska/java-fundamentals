package org.softuni.homework.collections;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mpatronska on 3/26/2016.
 */
public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i ++) {
            int number = sc.nextInt();
            numbers[i] = number;
        }

        Arrays.sort(numbers);

        for (int i = 0; i < n; i ++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
