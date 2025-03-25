package edu.ntudp.pzks.LR_3.controller;

import edu.ntudp.pzks.LR_3.model.Head;
import edu.ntudp.pzks.LR_3.model.University;


public class UniversityCreator {
    public University createUniversity(String name, Head rector) {
        return new University(name, rector);
    }
}
