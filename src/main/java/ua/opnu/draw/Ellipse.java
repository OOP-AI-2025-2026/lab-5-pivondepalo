package ua.opnu.draw;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Ellipse implements DrawableShape {
    private final Ellipse2D.Double shape;

    public Ellipse(Rectangle2D bounds) {
        this.shape = new Ellipse2D.Double(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
    }

    @Override
    public void paint(Graphics2D g) {
        g.draw(shape);
    }
}
