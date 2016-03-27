package org.softuni.homework.syntax;

import java.util.Scanner;

/**
 * Created by mpatronska on 3/18/2016.
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        int ax = Integer.parseInt(a.split(" ")[0]);
        int ay = Integer.parseInt(a.split(" ")[1]);

        int bx = Integer.parseInt(b.split(" ")[0]);
        int by = Integer.parseInt(b.split(" ")[1]);

        int cx = Integer.parseInt(c.split(" ")[0]);
        int cy = Integer.parseInt(c.split(" ")[1]);

        int area = Math.abs( (ax*(by - cy) + bx*(cy - ay) + cx*(ay - by)) / 2);

        System.out.println(area);
    }
}
