package org.softuni.homework.tpregexapi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mpatronska on 3/27/2016.
 */
public class ExtractWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Pattern pattern = Pattern.compile("[A-Za-z]{2,}");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

    }
}
