/**
 * Exercise 1 - MyPoint
 * Author: Wojtek Turek
 */

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x,y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - getX(), 2) + Math.pow(y - getY(), 2));
    }

    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(another.x - getX(), 2) + Math.pow(another.y - getY(), 2));
    }

    public double distance() {
        return Math.sqrt(Math.pow(-getX(), 2) + Math.pow(-getY(), 2));
    }


    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10];

        for(int i = 0; i < points.length; i++)
            points[i] = new MyPoint(i+1, i+1);

        for(int i = points.length-1; i >= 0; i--)
            System.out.println(points[i]);

        System.out.println(points[4].distance());
        System.out.println(points[4].distance(points[4]));
        System.out.println(points[4].distance(5,5));


    }

}
