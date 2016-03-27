package org.softuni.homework.collections;

import java.util.*;

/**
 * Created by mpatronska on 3/26/2016.
 */
public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = input.split("[-!~\\s.?:,]+");

        Set<String> uniqueWords = new TreeSet<>();

        Map<String, Integer> map = new TreeMap<>();

        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }


        for (String word : uniqueWords) {
            int count = 0;
            for (int i = 0; i < words.length; i ++) {
                if (word.equalsIgnoreCase(words[i])) {
                    count ++;
                }
            }
            map.put(word, count);
        }

        int max = 0;
        for (Map.Entry entry : map.entrySet()) {
            if ((Integer) entry.getValue() > max) {
                max = (Integer) entry.getValue();
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            if ((Integer) entry.getValue() == max) {
                System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
            }
        }
    }
}
