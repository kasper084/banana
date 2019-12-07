package shapes;

import interfaces.AreaMeasurable;
import interfaces.VolumeMeasurable;

import java.util.ArrayList;

public abstract class SpaceShape extends Shape implements VolumeMeasurable, AreaMeasurable {
    private ArrayList<Vertex> vertices3D = new ArrayList<>();

    public void add3DVtoAllV() {
        for (Vertex vertex : vertices3D) {
            getVerticesList().add(vertex);
        }
    }

    public ArrayList<Vertex> getVertices3D() {
        return vertices3D;
    }
}
