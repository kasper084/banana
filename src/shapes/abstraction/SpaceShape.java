package shapes.abstraction;

import shapes.interfaces.AreaMeasurable;
import shapes.interfaces.VolumeMeasurable;
import shapes.vertex.Vertex3D;

import java.util.ArrayList;
import java.util.List;

public abstract class SpaceShape extends Shape implements VolumeMeasurable, AreaMeasurable {
    List<Vertex3D> vertices = new ArrayList<>();

    public void add3DVtoAllV() {
        for (Vertex3D vertex : vertices) getVerticesList().add(vertex);
    }

    public List<Vertex3D> getVertices3D() {
        return vertices;
    }
}
