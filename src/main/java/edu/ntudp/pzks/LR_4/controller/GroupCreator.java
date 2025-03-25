package edu.ntudp.pzks.LR_4.controller;

import edu.ntudp.pzks.LR_4.model.Group;
import edu.ntudp.pzks.LR_4.model.Head;

public class GroupCreator {
    public Group createGroup(String name, String departmentShortName, int year, int number, Head head) {
        return new Group(name, departmentShortName, year, number, head);
    }
}
