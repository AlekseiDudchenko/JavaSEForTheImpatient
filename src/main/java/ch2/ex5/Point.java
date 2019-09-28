package ch2.ex5;

/**
 * 5. Implement an immutable class Point that describes a point in the plane.
 * Provide a constructor to set it to a specific point, a no-arg constructor to
 * set it to the origin, and methods getX, getY, translate, and scale. The translate
 * method moves the point by a given amount in x- and y-direction. The
 * scale method scales both coordinates by a given factor. Implement these
 * methods so that they return new points with the results. For example,
 * Point p = new Point(3, 4).translate(1, 3).scale(0.5);
 * should set p to a point with coordinates (2, 3.5).
 * 6. Repeat the preceding exercise, but now make translate and scale into
 * mutators.
 */

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        x = 0;
        y = 0;
    }

    double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }

    /**
     *
     * @param moveX
     * @param moveY
     * @return
     */
    public Point translate(double moveX, double moveY){
        return new Point(this.x + moveX, this.y + moveY);
    }

    /**
     *
     * @param scale
     * @return
     */
    public Point scale(double scale){
        return  new Point(this.x*scale, this.y*scale);
    }

    /**
     *
     * @param moveX
     * @param moveY
     */
    public void translateMutate(double moveX, double moveY){
        this.x += moveX;
        this.y += moveY;
    }

    /**
     *
     * @param scale
     */
    public void scaleMutate(double scale){
        this.x *= scale;
        this.y *= scale;
    }

    boolean equals(Point otherPoint){
        return (this.x == otherPoint.x && this.y == otherPoint.y);
    }

    @Override
    public String toString(){
        return "x = " + this.x + ", y = " + this.y;
    }

}
