package edu.ntudp.pzks.LR_3.controller;


import edu.ntudp.pzks.LR_3.model.Faculty;
import edu.ntudp.pzks.LR_3.model.Head;

public class FacultyCreator {
    public Faculty createFaculty(String name, Head dean) {
        return new Faculty(name, dean);
    }
}
