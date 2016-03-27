package org.softuni.homework.collections;

import java.util.Scanner;

/**
 * Created by mpatronska on 3/26/2016.
 */
public class CalculateN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calculateFactorial(n));
    }

    private static int calculateFactorial(int n) {
        int result;
        if (n == 0 || n == 1){
            return 1;
        } else {
            result = calculateFactorial(n-1) * n;
        }

        return result;
    }
}
