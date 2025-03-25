package edu.ntudp.pzks.LR_4.model;

import java.util.ArrayList;
import java.util.List;


public class Faculty {
    private String name;
    private Head head;
    private List<Department> departments;

    public Faculty(String name, Head head) {
        this.name = name;
        this.head = head;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public String getName() {
        return name;
    }

    public Head getHead() {
        return head;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}

