package ua.opnu.draw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrawModel {
    private final List<DrawableShape> shapes = new ArrayList<>();

    public void addShape(DrawableShape s) {
        if (s != null) shapes.add(s);
    }

    public void clear() {
        shapes.clear();
    }

    public List<DrawableShape> getShapes() {
        return Collections.unmodifiableList(shapes);
    }

    int size() { return shapes.size(); }
}
