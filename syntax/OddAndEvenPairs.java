package org.softuni.homework.syntax;

import java.util.Scanner;

/**
 * Created by mpatronska on 3/19/2016.
 */
public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] strings = input.split(" ");

        int[] numbers = new int[strings.length];
        for (int i = 0; i < strings.length; i ++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }

        if (numbers.length % 2 != 0) {
            System.out.println("Invalid length");
        } else {
            for (int i = 0; i < numbers.length; i+=2) {
                if (numbers[i] % 2 == 0 && numbers[i+1] % 2 == 0) {
                    System.out.println(numbers[i] + ", " + numbers[i+1] + " -> both are even");
                } else if (numbers[i] % 2 != 0 && numbers[i+1] % 2 != 0) {
                    System.out.println(numbers[i] + ", " + numbers[i+1] + " -> both are odd");
                } else {
                    System.out.println(numbers[i] + ", " + numbers[i+1] + " -> different");
                }
            }
        }
		
		//Testing conflicts - second repository
		//Testing conflicts - second repository - second change
    }
}
