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
        String[] bandArray = {"Pantera", "Slayer", "Sleep", "Kyuss", "Electric Wizard",
                "Black Sabbath", "Melvins", "Saint Vitus", "RED FANG", "Mother Witch & Dead Water Ghosts"};
        for (int num = 0; num < 10; num++) {
            lfu.addEntry(num, bandArray[num]);
        }
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