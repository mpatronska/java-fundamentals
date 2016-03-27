package org.softuni.homework.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mpatronska on 3/26/2016.
 */
public class CombineListOfLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l1 = sc.nextLine();
        String l2 = sc.nextLine();

        String[] chars1 = l1.split(" ");
        String[] chars2 = l2.split(" ");

        List<Character> list1 = new ArrayList<>();
        for (int i = 0 ; i < chars1.length; i ++) {
            list1.add(chars1[i].charAt(0));
        }

        List<Character> list2 = new ArrayList<>();
        for (int i = 0 ; i < chars2.length; i ++) {
            list2.add(chars2[i].charAt(0));
        }

        for (int i = 0; i < list2.size(); i ++) {
            if (!list1.contains(list2.get(i))) {
                list1.add(list2.get(i));
            }
        }

        for (int i = 0; i < list1.size(); i ++) {
            System.out.print(list1.get(i) + " ");
        }

    }
}
