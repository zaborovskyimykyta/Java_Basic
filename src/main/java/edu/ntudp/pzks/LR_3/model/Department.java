package edu.ntudp.pzks.LR_3.model;

import java.util.ArrayList;
import java.util.List;


public class Department {
    private String name;
    private String shortName;
    private Head head;
    private List<Group> groups = new ArrayList<>();

    public Department(String name, String shortName, Head head) {
        this.name = name;
        this.shortName = shortName;
        this.head = head;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }
}
