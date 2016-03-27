package org.softuni.homework.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mpatronska on 3/26/2016.
 */
public class CountSpecifiedWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String target = sc.nextLine();

        char[] array = input.toCharArray();

        List<String> words = new ArrayList<>();
        String word = "";

        for (int i = 0; i < array.length; i ++) {
            if (array[i] == ' ' || array[i] == '\'' || array[i] == '-') {
                words.add(word);
                word = "";
            } else {
                word += array[i];
            }
        }
        words.add(word);
        int count = 0;
        for (int i = 0;i < words.size(); i ++) {
            if (target.equalsIgnoreCase(words.get(i))) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
