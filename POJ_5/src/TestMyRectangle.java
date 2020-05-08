/**
 * Exercise 4 - MyRectangle - Test Class
 * Author: Wojtek Turek
 */

public class TestMyRectangle {
    public static void main(String[] args) {

        var rect = new MyRectangle(2,5,7,8);
        System.out.println("Top-left corner: " + rect.getTopLeft());
        System.out.println("Top-right corner: " + rect.getTopRight());
        System.out.println("Bottom-right corner: " + rect.getBottomRight());
        System.out.println("Bottom-left corner: " + rect.getBottomLeft());
        System.out.println("Diagonal: " + rect.getDiagonal());
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println("Area: " + rect.getArea());
        System.out.println(rect);

    }
}
