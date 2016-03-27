package org.softuni.homework.intro;

/**
 * Created by mpatronska on 3/16/2016.
 */
public class AssignVariables {
    public static void main(String[] args) {
        byte number = 127;
        short count = 32767;
        int tasks = 2000000000;
        long bees = 919827112351L;
        char symbol = 'c';
        boolean isDone = false;
        float sum = 0.5f;
        double price = 0.1234567891011;
        String name = "Palo Alto, CA";

//        short test = 32768; //Incompatible types

        System.out.println("[number=" + number + ", count=" + count + ", tasks=" + tasks +
                ", bees=" + bees + ", symbol=" + symbol + ", isDone=" + isDone +
                ", sum=" + sum + ", price=" + price + ", name=" + name + "]");
    }
}
