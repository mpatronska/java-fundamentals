package org.softuni.homework.intro;

import java.util.Scanner;

/**
 * Created by mpatronska on 3/16/2016.
 */
public class PrintCharacterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        printCharacterTriangle(input);

    }

    /**
     * Prints character triangle.
     *
     * @param number given number
     */
    private static void printCharacterTriangle(int number) {
        for (int i = 1; i <= number; i ++) {
            printCharacters(i);
            System.out.println();
        }
        for (int i = number - 1; i >= 1; i --) {
            printCharacters(i);
            System.out.println();
        }
    }

    /**
     * Prints characters of a row.
     *
     * @param row the row number
     */
    private static void printCharacters(int row) {
        for (int i = 1; i <= row; i ++) {
            System.out.print(getChar(i) + " ");
        }
    }

    /**
     * Returns English alphabet letter if the number is between 1 and 26,
     * otherwise returns '?'.
     *
     * @param number given number
     * @return character representation of the number
     */
    private static char getChar(int number) {
        char character = '?';
        switch (number){
            case 1:
                character = 'a';
                break;
            case 2:
                character = 'b';
                break;
            case 3:
                character = 'c';
                break;
            case 4:
                character = 'd';
                break;
            case 5:
                character = 'e';
                break;
            case 6:
                character = 'f';
                break;
            case 7:
                character = 'g';
                break;
            case 8:
                character = 'h';
                break;
            case 9:
                character = 'i';
                break;
            case 10:
                character = 'j';
                break;
            case 11:
                character = 'k';
                break;
            case 12:
                character = 'l';
                break;
            case 13:
                character = 'm';
                break;
            case 14:
                character = 'n';
                break;
            case 15:
                character = 'o';
                break;
            case 16:
                character = 'p';
                break;
            case 17:
                character = 'q';
                break;
            case 18:
                character = 'r';
                break;
            case 19:
                character = 's';
                break;
            case 20:
                character = 't';
                break;
            case 21:
                character = 'u';
                break;
            case 22:
                character = 'v';
                break;
            case 23:
                character = 'w';
                break;
            case 24:
                character = 'x';
                break;
            case 25:
                character = 'y';
                break;
            case 26:
                character = 'z';
                break;
        }

        return character;
    }
}
