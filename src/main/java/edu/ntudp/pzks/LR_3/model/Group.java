package edu.ntudp.pzks.LR_3.model;

import java.util.ArrayList;
import java.util.List;



public class Group {
    private String code;
    private Head curator;
    private List<Student> students = new ArrayList<>();

    public Group(String code, Head curator) {
        this.code = code;
        this.curator = curator;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

