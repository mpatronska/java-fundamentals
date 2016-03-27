package org.softuni.homework.collections;

import java.util.Scanner;

/**
 * Created by mpatronska on 3/26/2016.
 */
public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] strings = input.split(" ");

        if (strings.length > 1) {
            for (int i = 0; i < strings.length - 1; i ++) {
                if (strings[i].equals(strings[i+1])) {
                    System.out.print(strings[i] + " ");
                    if (i == strings.length - 2) {
                        System.out.print(strings[i+1]);
                    }
                } else {
                    System.out.println(strings[i]);
                    if (i == strings.length - 2) {
                        System.out.println(strings[i+1]);
                    }
                }
            }
        } else {
            System.out.println(input);
        }

    }
}
