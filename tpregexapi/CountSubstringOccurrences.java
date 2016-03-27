package org.softuni.homework.tpregexapi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mpatronska on 3/27/2016.
 */
public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String substring = sc.nextLine();

        Pattern pattern = Pattern.compile(substring, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println(count);

//        Note: fails for aaaaaa / aa
    }
}
