package org.softuni.homework.collections;

import java.util.Scanner;

/**
 * Created by mpatronska on 3/26/2016.
 */
public class CountAllWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] array = input.toCharArray();
        int words = 1;
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == ' ' || array[i] == '\'' || array[i] == '-') {
                words ++;
            }
        }

        System.out.println(words);
    }
}
