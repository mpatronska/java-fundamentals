package org.softuni.homework.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mpatronska on 3/20/2016.
 */
public class AllCapitals {

    private static final String FILE_PATH = "lines.txt";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        File outputFile = new File(FILE_PATH);

        List<String> lines = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            FileWriter fileWriter = new FileWriter(outputFile, false);
            PrintWriter printWriter = new PrintWriter(fileWriter, true);

            for (int i = 0; i < lines.size(); i ++) {
                printWriter.write(lines.get(i).toUpperCase());
                if (i != lines.size() - 1) {
                    printWriter.write('\n');
                }
            }

            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
