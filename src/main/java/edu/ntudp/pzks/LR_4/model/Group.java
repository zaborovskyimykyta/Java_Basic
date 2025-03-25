package edu.ntudp.pzks.LR_4.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private String departmentShortName;
    private int year;
    private int number;
    private Head head;
    private List<Student> students;

    public Group(String name, String departmentShortName, int year, int number, Head head) {
        this.name = name;
        this.departmentShortName = departmentShortName;
        this.year = year;
        this.number = number;
        this.head = head;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public Head getHead() {
        return head;
    }

    public List<Student> getStudents() {
        return students;
    }
}

