package org.softuni.homework.intro;

import java.util.Scanner;

/**
 * Created by mpatronska on 3/16/2016.
 */
public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int[] digits = getDigits(input);

        String result = "";
        for (int i = 0; i < digits.length; i ++){
            result += getGhetto(digits[i]);
        }

        System.out.println(result);
    }

    /**
     * Returns an array with number's digits.
     *
     * @param number given number
     * @return array with number's digits
     */
    private static int[] getDigits(int number) {
        int digitCount = Integer.toString(number).length();
        int[] digits = new int[digitCount];

        while (digitCount-- > 0) {
            digits[digitCount] = number % 10;
            number = number / 10;
        }

        return digits;
    }

    /**
     * Returns the given number in the Ghetto numeral system.
     *
     * @param number given number
     * @return ghetto representation of the given number
     */
    private static String getGhetto(int number) {
        String ghetto = null;
        switch (number) {
            case 0:
                ghetto = "Gee";
                break;
            case 1:
                ghetto = "Bro";
                break;
            case 2:
                ghetto = "Zuz";
                break;
            case 3:
                ghetto = "Ma";
                break;
            case 4:
                ghetto = "Duh";
                break;
            case 5:
                ghetto = "Yo";
                break;
            case 6:
                ghetto = "Dis";
                break;
            case 7:
                ghetto = "Hood";
                break;
            case 8:
                ghetto = "Jam";
                break;
            case 9:
                ghetto = "Mack";
                break;
        }

        return ghetto;
    }
}
