package edu.ntudp.pzks.LR_4.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String shortName;
    private Head head;
    private List<Group> groups;

    public Department(String name, String shortName, Head head) {
        this.name = name;
        this.shortName = shortName;
        this.head = head;
        this.groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public String getName() {
        return name;
    }

    public Head getHead() {
        return head;
    }

    public List<Group> getGroups() {
        return groups;
    }
}
