package org.softuni.homework.collections;

import java.util.Scanner;

/**
 * Created by mpatronska on 3/26/2016.
 */
public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] strings = input.split(" ");

        int currentLength = 1;
        int largestLength = 1;
        String largestString = strings[0];

        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i].equals(strings[i+1])) {
                currentLength ++;
            }
            else {
                currentLength = 1;
            }
            if (currentLength > largestLength) {
                largestLength = currentLength;
                largestString = strings[i];
            }
        }

        for (int i = 0; i < largestLength; i++) {
            System.out.print(largestString + " ");
        }
    }
}

