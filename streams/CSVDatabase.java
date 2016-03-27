package org.softuni.homework.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mpatronska on 3/20/2016.
 */
public class CSVDatabase {
    public static void main(String[] args) {
        try {
            BufferedReader studentsReader = new BufferedReader(new FileReader("students.txt"));
            BufferedReader gradesReader = new BufferedReader(new FileReader("grades.txt"));

//            searchByFullName("Georgi Ivanov", studentsReader, gradesReader);
//            searchById("3", studentsReader, gradesReader);
//            deleteById("5", studentsReader, gradesReader);
//            updateById("5", "Georgi Mamarchev 19 Sofia", "Math 2.00 2.00 3.50 4.00,Literature 4.00 5.25", studentsReader, gradesReader);
              insertGradeById("7", "Math 4.00", studentsReader, gradesReader);
            insertStudent("Magi2 P2 20 Sofia", studentsReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void searchByFullName(String name, BufferedReader studentsReader, BufferedReader gradesReader) {
        String firstName = name.split(" ")[0];
        String lastName = name.split(" ")[1];

        try {
            String studentsLine;
            while ((studentsLine = studentsReader.readLine()) != null) {
                if (studentsLine.split(",")[1].equals(firstName) && studentsLine.split(",")[2].equals(lastName)) {

                    System.out.println(firstName + " " + lastName + "(age: " + studentsLine.split(",")[3] + ", town: " + studentsLine.split(",")[4] + ")");
                    String id = studentsLine.split(",")[0];

                    String gradesLine;
                    while ((gradesLine = gradesReader.readLine()) != null) {
                        if (gradesLine.split(",")[0].equals(id)) {

                            String firstCourse = gradesLine.split(",")[1];
                            String secondCourse = gradesLine.split(",")[2];

                            String[] firstGrades = firstCourse.split(" ");
                            String[] secondGrades = secondCourse.split(" ");

                            System.out.print("# " + firstGrades[0] + ": ");
                            for (int i = 1; i < firstGrades.length; i++) {
                                System.out.print(firstGrades[i]);
                                if (i != firstGrades.length - 1) {
                                    System.out.print(", ");
                                }
                            }

                            System.out.println();

                            System.out.print("# " + secondGrades[0] + ": ");
                            for (int i = 1; i < secondGrades.length; i++) {
                                System.out.print(secondGrades[i]);
                                if (i != secondGrades.length - 1) {
                                    System.out.print(", ");
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("Student does not exist");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void searchById(String id, BufferedReader studentsReader, BufferedReader gradesReader) {
        try {
            String studentsLine;
            while ((studentsLine = studentsReader.readLine()) != null) {
                if (studentsLine.split(",")[0].equals(id)) {

                    String firstName = studentsLine.split(",")[1];
                    String lastName = studentsLine.split(",")[2];

                    System.out.println(firstName + " " + lastName + "(age: " + studentsLine.split(",")[3] + ", town: " + studentsLine.split(",")[4] + ")");

                    String gradesLine;
                    while ((gradesLine = gradesReader.readLine()) != null) {
                        if (gradesLine.split(",")[0].equals(id)) {

                            String firstCourse = gradesLine.split(",")[1];
                            String secondCourse = gradesLine.split(",")[2];

                            String[] firstGrades = firstCourse.split(" ");
                            String[] secondGrades = secondCourse.split(" ");

                            System.out.print("# " + firstGrades[0] + ": ");
                            for (int i = 1; i < firstGrades.length; i++) {
                                System.out.print(firstGrades[i]);
                                if (i != firstGrades.length - 1) {
                                    System.out.print(", ");
                                }
                            }

                            System.out.println();

                            System.out.print("# " + secondGrades[0] + ": ");
                            for (int i = 1; i < secondGrades.length; i++) {
                                System.out.print(secondGrades[i]);
                                if (i != secondGrades.length - 1) {
                                    System.out.print(", ");
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("Student does not exist");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deleteById(String id, BufferedReader studentsReader, BufferedReader gradesReader) {
        try {
            List<String> students = new ArrayList<>();
            List<String> grades = new ArrayList<>();
            String studentsLine;
            while ((studentsLine = studentsReader.readLine()) != null) {
                if (studentsLine.split(",")[0].equals(id)) {

                    String gradesLine;
                    while ((gradesLine = gradesReader.readLine()) != null) {
                        if (gradesLine.split(",")[0].equals(id)) {


                        } else {
                            grades.add(gradesLine);
                            System.out.println("Student does not exist");
                        }
                    }
                } else {
                    students.add(studentsLine);
                    System.out.println("Student does not exist");
                }
            }

            FileWriter studentsFw = new FileWriter("students.txt", false);
            PrintWriter studentsPw = new PrintWriter(studentsFw, true);
            for (int i = 0; i < students.size(); i++) {
                studentsPw.write(students.get(i));
                studentsPw.write('\n');
            }

            FileWriter gradesFw = new FileWriter("grades.txt", false);
            PrintWriter gradesPw = new PrintWriter(gradesFw, true);
            for (int i = 0; i < students.size(); i++) {
                gradesPw.write(students.get(i));
                gradesPw.write('\n');
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void updateById(String id, String studentInfo, String studentGrades, BufferedReader studentsReader, BufferedReader gradesReader) {
        try {
            List<String> students = new ArrayList<>();
            List<String> grades = new ArrayList<>();
            String studentsLine;
            while ((studentsLine = studentsReader.readLine()) != null) {
                if (studentsLine.split(",")[0].equals(id)) {

                    String gradesLine;
                    while ((gradesLine = gradesReader.readLine()) != null) {
                        if (gradesLine.split(",")[0].equals(id)) {


                        } else {
                            grades.add(gradesLine);
                            System.out.println("Student does not exist");
                        }
                    }
                } else {
                    students.add(studentsLine);
                    System.out.println("Student does not exist");
                }
            }

            FileWriter studentsFw = new FileWriter("students.txt", false);
            PrintWriter studentsPw = new PrintWriter(studentsFw, true);
            for (int i = 0; i < students.size(); i++) {
                studentsPw.write(students.get(i));
                studentsPw.write('\n');
            }

            studentsPw.write(id + ",");
            String[] studentInfoArray = studentInfo.split(" ");
            for (int i = 0; i < studentInfoArray.length; i++) {
                studentsPw.write(studentInfoArray[i]);
                if (i != studentInfoArray.length - 1) {
                    studentsPw.write(",");
                }
            }

            FileWriter gradesFw = new FileWriter("grades.txt", false);
            PrintWriter gradesPw = new PrintWriter(gradesFw, true);
            for (int i = 0; i < grades.size(); i++) {
                gradesPw.write(grades.get(i));
                gradesPw.write('\n');
            }

            gradesPw.write(id + ",");
            String[] gradesInfoArray = studentGrades.split(" ");
            for (int i = 0; i < gradesInfoArray.length; i++) {
                gradesPw.write(gradesInfoArray[i]);
                if (i != gradesInfoArray.length - 1) {
                    gradesPw.write(",");
                }
            }

            studentsFw.close();
            studentsPw.close();
            gradesFw.close();
            gradesPw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void insertStudent(String studentInfo, BufferedReader studentsReader) {
        try {
            List<String> students = new ArrayList<>();

            String studentsLine;
            int maxId = 0;
            while ((studentsLine = studentsReader.readLine()) != null) {
                if (Integer.parseInt(studentsLine.split(",")[0]) > maxId) {
                    maxId =  Integer.parseInt(studentsLine.split(",")[0]);
                }
                students.add(studentsLine);
            }

            FileWriter studentsFw = new FileWriter("students.txt", false);
            PrintWriter studentsPw = new PrintWriter(studentsFw, true);

            for (int i = 0; i < students.size(); i++) {
                studentsPw.write(students.get(i));
                studentsPw.write('\n');
            }

            studentsPw.write((maxId + 1) + ",");
            String[] studentInfoArray = studentInfo.split(" ");
            for (int i = 0; i < studentInfoArray.length; i++) {
                studentsPw.write(studentInfoArray[i]);
                if (i != studentInfoArray.length - 1) {
                    studentsPw.write(",");
                }
            }

            studentsPw.close();
            studentsFw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void insertGradeById(String id, String studentGrades, BufferedReader studentsReader, BufferedReader gradesReader) {
        try {
            List<String> students = new ArrayList<>();
            List<String> grades = new ArrayList<>();
            String studentsLine;
            while ((studentsLine = studentsReader.readLine()) != null) {
                if (studentsLine.split(",")[0].equals(id)) {

                    String gradesLine;
                    while ((gradesLine = gradesReader.readLine()) != null) {
                        grades.add(gradesLine);
                    }
                } else {
                    students.add(studentsLine);
                    System.out.println("Student does not exist");
                }
            }

            FileWriter gradesFw = new FileWriter("grades.txt", false);
            PrintWriter gradesPw = new PrintWriter(gradesFw, true);
            for (int i = 0; i < grades.size(); i++) {
                gradesPw.write(grades.get(i));
                gradesPw.write('\n');
            }

            gradesPw.write(id + ",");
            String[] gradesInfoArray = studentGrades.split(" ");
            for (int i = 0; i < gradesInfoArray.length; i++) {
                gradesPw.write(gradesInfoArray[i]);
                if (i != gradesInfoArray.length - 1) {
                    gradesPw.write(",");
                }
            }

            gradesFw.close();
            gradesPw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
