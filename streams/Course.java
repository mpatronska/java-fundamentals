package org.softuni.homework.streams;

import java.io.Serializable;

/**
 * Created by mpatronska on 3/20/2016.
 */
public class Course implements Serializable {
    private String name;
    private int students;

    public Course(String name, int students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }
}
