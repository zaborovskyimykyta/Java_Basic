package edu.ntudp.pzks.LR_4.model;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private Head head;
    private List<Faculty> faculties;

    public University(String name, Head head) {
        this.name = name;
        this.head = head;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public String getName() {
        return name;
    }

    public Head getHead() {
        return head;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}