package data;

public class Point extends Form {

    private double x;
    private double y;

    public Point(String name, double x, double y) {
        super(name);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // override of Form::translate (implements)
    @Override
    public void translate(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    // override of Object::toString (redefines)
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(getName());
        sb.append("{").append(x);
        sb.append(", ").append(y);
        sb.append('}');
        return sb.toString();
    }
}
