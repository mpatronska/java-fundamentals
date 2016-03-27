package org.softuni.homework.intro;

import java.util.Scanner;

/**
 * Created by mpatronska on 3/16/2016.
 */
public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= input; i ++){
            sum += i;
        }

        System.out.println(sum);
    }
}
