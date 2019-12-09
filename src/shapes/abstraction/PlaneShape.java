package shapes.abstraction;

import shapes.interfaces.AreaMeasurable;
import shapes.interfaces.PerimeterMeasurable;
import shapes.vertex.Vertex;

import java.util.ArrayList;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    private ArrayList<Vertex> vertices2D = new ArrayList<>();

    public void add2DVtoAllV() {
        for (Vertex vertex : vertices2D) getVerticesList().add(vertex);
    }

    public ArrayList<Vertex> getVertices2D() {
        return vertices2D;
    }

}
