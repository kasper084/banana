package shapes;

import java.util.ArrayList;

public abstract class Shape {
    private ArrayList<Vertex> verticesList = new ArrayList<>();

    public ArrayList<Vertex> getVerticesList() {
        return verticesList;
    }
}
