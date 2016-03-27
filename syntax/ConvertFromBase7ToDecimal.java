package org.softuni.homework.syntax;

import java.util.Scanner;

/**
 * Created by mpatronska on 3/19/2016.
 */
public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(Integer.toString(Integer.valueOf(Integer.toString(input), 7), 10));
    }


}
