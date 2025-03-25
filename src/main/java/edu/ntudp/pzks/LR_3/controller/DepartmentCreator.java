package edu.ntudp.pzks.LR_3.controller;

import edu.ntudp.pzks.LR_3.model.Department;
import edu.ntudp.pzks.LR_3.model.Head;

public class DepartmentCreator {
    public Department createDepartment(String name, String shortName, Head head) {
        return new Department(name, shortName, head);
    }
}
