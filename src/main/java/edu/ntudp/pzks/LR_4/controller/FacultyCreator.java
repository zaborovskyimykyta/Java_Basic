package edu.ntudp.pzks.LR_4.controller;

import edu.ntudp.pzks.LR_4.model.Faculty;
import edu.ntudp.pzks.LR_4.model.Head;


public class FacultyCreator {
    public Faculty createFaculty(String name, Head head) {
        return new Faculty(name, head);
    }
}
