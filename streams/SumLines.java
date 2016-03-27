package org.softuni.homework.streams;

import java.io.*;

/**
 * Created by mpatronska on 3/20/2016.
 */
public class SumLines {

    private static final String FILE_PATH = "lines.txt";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);


        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                int sum = 0;
                char[] array = line.toCharArray();
                for (int i = 0; i < array.length; i ++) {
                    sum += array[i];
                }
                System.out.println(sum);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
