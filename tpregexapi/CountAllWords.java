package org.softuni.homework.tpregexapi;

import java.util.Scanner;

/**
 * Created by mpatronska on 3/27/2016.
 */
public class CountAllWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = input.split("[-!~\\s.?:,']+");

        System.out.println(words.length);
    }
}
