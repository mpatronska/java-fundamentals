package org.softuni.homework.syntax;

import java.util.Scanner;

/**
 * Created by mpatronska on 3/19/2016.
 */
public class CalculateExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        double f1 = Math.pow((double)((a*a + b*b)/(a*a - b*b)), (a + b + c)/Math.sqrt(c));
        double f2 = Math.pow((double) (a*a + b*b - c*c*c), (a - b));
        double diff = Math.abs((a + b + c)/3 - (f1 + f2)/2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, diff);
    }
}
