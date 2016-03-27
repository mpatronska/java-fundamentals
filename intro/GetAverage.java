package org.softuni.homework.intro;

import java.util.Scanner;

/**
 * Created by mpatronska on 3/16/2016.
 */
public class GetAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float average = getAverage(a, b, c);
        System.out.printf("%.2f", average);
    }

    /**
     * Finds the average value of three numbers.
     *
     * @param a first number
     * @param b second number
     * @param c third number
     * @return average of three numbers
     */
    private static float getAverage(float a, float b, float c) {
        return (a + b + c) / 3;
    }
}
