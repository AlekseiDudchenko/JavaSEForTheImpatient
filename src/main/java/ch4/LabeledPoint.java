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

// todo tests
public class LabeledPoint extends Point {
    private String label;

     LabeledPoint(String label, double x, double y){
         super(x, y);
         this.label = label;
    }

    public String getLabel() {
        return label;
    }

    //todo
    public boolean equals(LabeledPoint otherPoint){
        return  (this.x == otherPoint.x && this.y == otherPoint.y);
    }
}