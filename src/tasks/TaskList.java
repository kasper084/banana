package tasks;

import lfu.LFU;

public class TaskList {
    private LFU lfu = new LFU();

    public void printResult() {
        addInfo();
        createFakeRequest();
        lfu.printMostRequested();
    }

    private void addInfo() {
        lfu.addEntry(0, "Pantera");
        lfu.addEntry(1, "Slayer");
        lfu.addEntry(2, "Sleep");
        lfu.addEntry(3, "Kyuss");
        lfu.addEntry(4, "Electric Wizard");
        lfu.addEntry(5, "Black Sabbath");
        lfu.addEntry(6, "Melvins");
        lfu.addEntry(7, "Saint Vitus");
        lfu.addEntry(8, "RED FANG");
        lfu.addEntry(9, "Mother Witch & Dead Water Ghosts");
    }

    private void createFakeRequest() {
        lfu.getEntry(1);
        lfu.getEntry(4);
        lfu.getEntry(9);
        lfu.getEntry(4);
        lfu.getEntry(5);
        lfu.getEntry(5);
        lfu.getEntry(9);
        lfu.getEntry(4);
        lfu.getEntry(8);
    }
}