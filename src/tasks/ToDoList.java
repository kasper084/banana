package tasks;

import division.SafeDivision;
import exceptions.Catcher;

public class ToDoList {
    public void printResults() {
        SafeDivision safeDivision = new SafeDivision();
        Catcher catcher = new Catcher();
        safeDivision.getResult();
        System.out.println();
        catcher.hunt();
    }
}