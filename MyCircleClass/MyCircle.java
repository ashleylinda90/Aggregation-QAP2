package MyCircleClass;

public class MyCircle {

    // Instance variables
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    // Default constructor with default center and radius
    public MyCircle() {
        center = new MyPoint(0, 0);
        this.radius = 1;
    }

    // Constructor with given x,y values and radius
    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    // Constructor with given center and radius
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // GETTERS

    public int getRadius() {
        return radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY();
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // SETTERS

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    // toString method

    public String toString() {
        return "MyCircle[radius = r, center = (x,y)]";
    }

    // distance method

    public double distance(MyCircle another) {
        return center.distance(another.center);
    }

}
