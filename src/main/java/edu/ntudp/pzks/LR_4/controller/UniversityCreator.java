package edu.ntudp.pzks.LR_4.controller;

import edu.ntudp.pzks.LR_4.model.Head;
import edu.ntudp.pzks.LR_4.model.University;

public class UniversityCreator {
    public University createUniversity(String name, Head head) {
        return new University(name, head);
    }
}
