package edu.ntudp.pzks.LR_3.model;

import java.util.ArrayList;
import java.util.List;


public class Faculty {
    private String name;
    private Head dean;
    private List<Department> departments = new ArrayList<>();

    public Faculty(String name, Head dean) {
        this.name = name;
        this.dean = dean;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }
}

