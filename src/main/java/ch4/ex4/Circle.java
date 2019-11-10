package ch4.ex4;

import ch2.ex5ex6.Point;

/***
 * Define an abstract class Shape with an instance variable of class Point, a
 * constructor, a concrete method public void moveBy(double dx, double dy) that
 * moves the point by the given amount, and an abstract method public Point
 * getCenter(). Provide concrete subclasses Circle, Rectangle, Line with constructors
 * public Circle(Point center, double radius), public Rectangle(Point topLeft, double width,
 * double height), and public Line(Point from, Point to).
 */

public class Circle extends Shape {
    private double radius;

    public Circle(Point center, double radius){
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return this.point;
    }
}
