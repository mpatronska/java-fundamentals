package org.softuni.homework.collections;

import java.util.*;

/**
 * Created by mpatronska on 3/26/2016.
 */
public class CardsFrequencies {
    public static void main(String[] args) {
        //"\u2665", "\u2666", "\u2663", "\u2660"
//        System.out.print("\u2665");
//        System.out.print("\u2666");
//        System.out.print("\u2663");
//        System.out.print("\u2660");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] cards = input.split(" ");

        Set<String> cardsSet = new LinkedHashSet<>();

        for (int i = 0; i < cards.length; i ++) {
            String cardFace = cards[i].split("[\\u2660\\u2663\\u2666\\u2665]")[0];
            cardsSet.add(cardFace);
        }

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String card : cardsSet) {
            int appearances = 0;
            for (int i = 0 ; i < cards.length; i ++) {
                if (cards[i].contains(card)) {
                    appearances ++;
                }
            }
            map.put(card, appearances);
        }

        for (Map.Entry entry : map.entrySet()) {
            double frequency = ((Integer) entry.getValue() / (double)cards.length) * 100;
            System.out.printf("%s -> %.2f", entry.getKey(), frequency);
            System.out.println("%");
        }
    }
}
