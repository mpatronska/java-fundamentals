package org.softuni.homework.tpregexapi;

import java.util.Scanner;

/**
 * Created by mpatronska on 3/27/2016.
 */
public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String target = sc.nextLine();

        String[] words = input.split("[-!~\\s.?:,']+");

        int count = 0;

        for (int i = 0; i < words.length; i ++) {
            if (target.equalsIgnoreCase(words[i])) {
                count ++;
            }
        }

        System.out.println(count);
    }
}
