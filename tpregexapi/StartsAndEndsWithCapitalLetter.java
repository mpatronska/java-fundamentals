package org.softuni.homework.tpregexapi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mpatronska on 3/27/2016.
 */
public class StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = input.split(" ");

        Pattern pattern = Pattern.compile("[A-Z][A-Za-z]*[A-Z]+");

        Matcher matcher;

        for (int i = 0; i < words.length; i ++) {
            matcher = pattern.matcher(words[i]);
            if (matcher.matches()) {
                System.out.print(words[i] + " ");
            }
        }

    }
}
