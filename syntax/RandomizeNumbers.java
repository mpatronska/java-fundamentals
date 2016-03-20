package org.softuni.homework.syntax;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by mpatronska on 3/19/2016.
 */
public class RandomizeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Random random = new Random();
        int[] array = new int[Math.abs(n-m) + 1];
        int index = 0;
        if (n <= m) {
            for (int i = n; i <=m; i ++) {
                array[index] = i;
                index++;
            }
        } else {
            for (int i = m; i <=n; i ++) {
                array[index] = i;
                index++;
            }
        }

        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[random.nextInt(array.length)] + " ");
        }

    }
}
