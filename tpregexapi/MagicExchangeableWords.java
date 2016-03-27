package org.softuni.homework.tpregexapi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by mpatronska on 3/27/2016.
 */
public class MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");

        char[] word1 = words[0].toCharArray();
        char[] word2 = words[1].toCharArray();

        if (word1.length == word2.length) {
            Map<Character, Character> map = new HashMap<>();
            boolean result = false;
            for (int i = 0; i < word1.length; i ++) {
                if (map.containsKey(word1[i])) {
                    if (word2[i] == map.get(word1[i])) {
                        result = true;
                    } else {
                        result = false;
                    }
                } else {
                    map.put(word1[i], word2[i]);
                }
            }

            System.out.println(result);
        }
    }
}
