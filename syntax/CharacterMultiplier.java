package org.softuni.homework.syntax;

import java.util.Scanner;

/**
 * Created by mpatronska on 3/19/2016.
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String string1 = input.split(" ")[0];
        String string2 = input.split(" ")[1];

        System.out.println(multiplyCharacters(string1, string2));
		
		//Test comment for testing git
    }

    private static int multiplyCharacters(String string1, String string2) {
        int sum = 0;
        if (string1.length() == string2.length()) {
            for (int i = 0; i < string1.length(); i++) {
                sum += string1.charAt(i) * string2.charAt(i);
            }
        } else if (string1.length() > string2.length()) {
            for (int i = 0; i < string2.length(); i++) {
                sum += string1.charAt(i) * string2.charAt(i);
            }

            for (int i = string2.length(); i < string1.length(); i ++) {
                sum += string1.charAt(i);
            }
        } else if (string1.length() < string2.length()) {
            for (int i = 0; i < string1.length(); i++) {
                sum += string1.charAt(i) * string2.charAt(i);
            }

            for (int i = string1.length(); i < string2.length(); i ++) {
                sum += string2.charAt(i);
            }
        }

        return sum;
    }
}
