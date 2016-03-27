package org.softuni.homework.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by mpatronska on 3/20/2016.
 */
public class CopyJPGFile {

    private static final String JPG = "flower.jpg";

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream(JPG);
            FileOutputStream outputStream = new FileOutputStream("my-copied-picture.jpg");
            int content;
            while ((content = inputStream.read()) != -1) {
                outputStream.write(content);
            }

            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
