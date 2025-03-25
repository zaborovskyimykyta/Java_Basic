package edu.ntudp.pzks.LR_3.controller;

import edu.ntudp.pzks.LR_3.model.Group;
import edu.ntudp.pzks.LR_3.model.Head;

public class GroupCreator {
    public Group createGroup(String shortName, String departmentShortName, int year, int number, Head curator) {
        String code = departmentShortName + "-" + year + "-" + number;
        return new Group(code, curator);
    }
}
