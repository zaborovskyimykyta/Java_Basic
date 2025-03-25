package edu.ntudp.pzks.LR_3.model;

import java.util.ArrayList;
import java.util.List;



public class University {
    private String name;
    private Head rector;
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name, Head rector) {
        this.name = name;
        this.rector = rector;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public String getName() {
        return name;
    }
}
