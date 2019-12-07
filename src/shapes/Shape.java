package shapes;

import java.util.ArrayList;

public abstract class Shape {
    private ArrayList<Vertex> verticesList = new ArrayList<>();

    public String printList() {
        return getVerticesList().toString();

    }

    public ArrayList<Vertex> getVerticesList() {
        return verticesList;
    }
}
