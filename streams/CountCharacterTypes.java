package org.softuni.homework.streams;

import java.io.*;

/**
 * Created by mpatronska on 3/20/2016.
 */
public class CountCharacterTypes {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("words.txt"));

            String line;
            int vowels = 0;
            int consonants = 0;
            int punctuationsMarks = 0;

            while ((line = reader.readLine()) != null) {
                char[] array = line.toCharArray();
                for (int i = 0; i < array.length; i ++) {
                    if (array[i] == 'a' || array[i] == 'A' || array[i] == 'e' || array[i] == 'e' ||
                            array[i] == 'i' || array[i] == 'I' || array[i] == 'o' ||
                            array[i] == 'O' || array[i] == 'u' || array[i] == 'U') {
                        vowels ++;
                    } else if (array[i] == '(' || array[i] == '!' || array[i] == ',' ||
                            array[i] == '.' || array[i] == '?' || array[i] == ')') {
                        punctuationsMarks ++;
                    } else if (array[i] != ' ' && array[i] != '\n') {
                        consonants ++;
                    }
                }
            }

            reader.close();

            FileWriter fw = new FileWriter("count-chars.txt");
            PrintWriter pw = new PrintWriter(fw);

            pw.write("Vowels: " + vowels);
            pw.write('\n');
            pw.write("Consonants: " + consonants);
            pw.write('\n');
            pw.write("Punctuation: " + punctuationsMarks);

            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
