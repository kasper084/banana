package shapes.abstraction;

import shapes.interfaces.AreaMeasurable;
import shapes.interfaces.PerimeterMeasurable;
import shapes.vertex.Vertex2D;

import java.util.ArrayList;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    private ArrayList<Vertex2D> vertices = new ArrayList<>();

    public void add2DVtoAllV() {
        for (Vertex2D vertex : vertices) getVerticesList().add(vertex);
    }

    public ArrayList<Vertex2D> getVertices2D() {
        return vertices;
    }
}