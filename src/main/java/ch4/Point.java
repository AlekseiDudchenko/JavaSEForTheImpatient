package ch4;

/**
 * Define a class Point with a constructor public Point(double x, double y) and
 * accessor methods getX, getY. Define a subclass LabeledPoint with a constructor
 * public LabeledPoint(String label, double x, double y) and an accessor method
 * getLabel.
 * //**
 * Define toString, equals, and hashCode methods for the classes of the preceding
 * exercise.
 */

public class Point {
    private double x, y;

    public Point(double x , double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object object){
        if (object instanceof Point) {
            Point otherPoint = (Point) object;
            return this.x == otherPoint.x && this.y == otherPoint.y;
        } else return false;
    }

    @Override
    public String toString(){
        return "X = " + x + ", Y = " + y;
    }


//    public void hashCode(){
//
//    }
}
