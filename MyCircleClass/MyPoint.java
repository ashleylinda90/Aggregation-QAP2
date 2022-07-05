package MyCircleClass;

public class MyPoint {

    // instance variables
    private int x = 0;
    private int y = 0;

    // The default constructor
    // Construct a Point instance with the default values
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Construct a Point instance with the given x and y values
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // GETTERS

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // SETTERS

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // toString method with override
    @Override
    public String toString() {
        return ("Coordinates are (" + this.x + "," + this.y + ")");
    }

    // Returns the distance from this instance to the given point at (x,y)
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Returns the distance from this instance to the given Point instance
    public double distance(MyPoint otherPoint) {
        int xDiff = this.x - otherPoint.x;
        int yDiff = this.y - otherPoint.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);

    }

    // Returns the distance from this instance to (0,0)
    public double distance() {
        int xDiff = this.x - 0;
        int yDiff = this.y - 0;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
