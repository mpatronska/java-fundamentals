package org.softuni.homework.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by mpatronska on 3/26/2016.
 */
public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = input.split("[-!~\\s.?:,]+");

        Set<String>  uniqueWords = new TreeSet<>();

        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }

        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }
    }
}
