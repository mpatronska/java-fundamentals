package org.softuni.homework.syntax;

import java.util.Scanner;

/**
 * Created by mpatronska on 3/18/2016.
 */
public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short a = sc.nextShort();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        String hex = Integer.toHexString(a & 0xffff).toUpperCase();
        String bin = Integer.toBinaryString(a);
        while (bin.length() < 10) {
            bin = "0" + bin;
        }
        System.out.printf("%-10s%s%10s%s%10.2f%s%-10.3f%s", hex, "|", bin, "|", b, "|", c, "|");
    }
}