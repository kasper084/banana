package shapes.abstraction;

import shapes.vertex.Vertex;

import java.util.ArrayList;

public abstract class Shape {
    private ArrayList<Vertex> verticesList = new ArrayList<>();

    public ArrayList<Vertex> getVerticesList() {
        return verticesList;
    }


    @Override
    public String toString() {
        return getClass().getSuperclass().getSimpleName()
                + "-"
                + getClass().getSimpleName()
                + ": ";
    }
}
