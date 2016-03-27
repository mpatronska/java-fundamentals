package org.softuni.homework.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by mpatronska on 3/20/2016.
 */
public class CreateZipArchive {
    public static void main(String[] args) {
        try {
            ZipOutputStream zip = new ZipOutputStream(new FileOutputStream("text-files.zip"));

            ZipEntry wordsEntry = new ZipEntry("words.txt");
            zip.putNextEntry(wordsEntry);

            FileInputStream wordsFis = new FileInputStream("words.txt");
            byte[] wordsBytes = new byte[1024];
            int wordsLength;
            while ((wordsLength = wordsFis.read(wordsBytes)) >= 0) {
                zip.write(wordsBytes, 0, wordsLength);
            }

            ZipEntry countCharsEntry = new ZipEntry("count-chars.txt");
            zip.putNextEntry(countCharsEntry);

            FileInputStream countCharsFis = new FileInputStream("count-chars.txt");
            byte[] countCharsBytes = new byte[1024];
            int countCharsLength;
            while ((countCharsLength = countCharsFis.read(countCharsBytes)) >= 0) {
                zip.write(countCharsBytes, 0, countCharsLength);
            }

            ZipEntry linesEntry = new ZipEntry("lines.txt");
            zip.putNextEntry(linesEntry);

            FileInputStream linesFis = new FileInputStream("lines.txt");
            byte[] linesBytes = new byte[1024];
            int linesLength;
            while ((linesLength = linesFis.read(linesBytes)) >= 0) {
                zip.write(linesBytes, 0, linesLength);
            }

            zip.closeEntry();
            zip.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
