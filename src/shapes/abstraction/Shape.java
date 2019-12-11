package shapes.abstraction;

import shapes.vertex.Vertex;
import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    List<Vertex> verticesList = new ArrayList<>();

    public List<Vertex> getVerticesList() {
        return verticesList;
    }

    @Override
    public String toString() {
        return getClass().getSuperclass().getSimpleName()
                + "-"
                + getClass().getSimpleName()
                + ": "
                + getVerticesList().toString();
    }
}