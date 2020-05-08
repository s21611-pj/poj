/**
 * Exercise 4 - MyRectangle
 * UML created (pdf file in src)
 * Author: Wojtek Turek
 */

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(Math.min(x1, x2), Math.max(y1, y2));
        this.bottomRight = new MyPoint(Math.max(x1, x2), Math.min(y1, y2));
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public MyPoint getTopRight() {
        return new MyPoint(bottomRight.getX(), topLeft.getY());
    }

    public MyPoint getBottomLeft() {
        return new MyPoint(topLeft.getX(), bottomRight.getY());
    }

    public double getDiagonal() {
        return topLeft.distance(bottomRight);
    }

    public double getPerimeter() {
        return 2 * topLeft.distance(getTopRight()) +
                2 * bottomRight.distance(getTopRight());
    }

    public double getArea() {
        return topLeft.distance(getTopRight()) *
                bottomRight.distance(getTopRight());
    }

    @Override
    public String toString() {
        return String.format(
            "MyRectangle" +
            "[topLeft=(%d,%d), " +
            "topRight=(%d,%d), " +
            "bottomRight=(%d,%d), " +
            "bottomLeft=(%d,%d)]",
            topLeft.getX(),topLeft.getY(),
            getTopRight().getX(), getTopRight().getY(),
            bottomRight.getX(), bottomRight.getY(),
            getBottomLeft().getX(), getBottomLeft().getY()
        );
    }

}
