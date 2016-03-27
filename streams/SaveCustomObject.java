package org.softuni.homework.streams;

import java.io.*;

/**
 * Created by mpatronska on 3/20/2016.
 */
public class SaveCustomObject {
    public static void main(String[] args) {
        Course course = new Course("Java Fundamentals", 100);

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("course.save"));
            outputStream.writeObject(course);

            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("course.save"));
            System.out.println("Course: " + inputStream.readObject());

            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
