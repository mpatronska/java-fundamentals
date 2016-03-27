package org.softuni.homework.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mpatronska on 3/20/2016.
 */
public class SaveArrayListOfDoubles {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();

        list.add(2.4);
        list.add(6.3);
        list.add(12.76);

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("doubles.list"));
            outputStream.writeObject(list);

            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("doubles.list"));
            System.out.println("list: " + inputStream.readObject());

            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
