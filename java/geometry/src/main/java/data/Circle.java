package data;

public class Circle extends Form {

    private double radius;

    private Point center;

    public Circle(String name, double radius, Point center) {
        super(name);
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void translate(double deltaX, double deltaY) {
        this.center.translate(deltaX, deltaY);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getName());
        sb.append("[r=").append(radius);
        sb.append(", c=").append(center.getName());
        sb.append(']');
        return sb.toString();
    }
}
