package ch4.ex1ex2;

/**
 * Define a class Point with a constructor public Point(double x, double y) and
 * accessor methods getX, getY. Define a subclass LabeledPoint with a constructor
 * public LabeledPoint(String label, double x, double y) and an accessor method
 * getLabel.
 * //**
 * Define toString, equals, and hashCode methods for the classes of the preceding
 * exercise.
 */

public class LabeledPoint extends Point {
    private String label;

     LabeledPoint(String label, double x, double y){
         super(x, y);
         this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString(){
         return "X = " + getX() + ", Y = " + getY() + " " + getLabel();
    }

    /**
     * Labeled Points are equal if their x and y are equal.
     * @param object point to compare
     * @return
     */
    @Override
    public boolean equals(Object object){
        return super.equals(object);
    }

    @Override
    public int hashCode(){
         int hash = 7;
         hash = hash + super.hashCode();
         hash = 31 * hash + (label == null ? 0 : label.hashCode());
         return hash;
         /*
        "The implementation utilize number 31
        because 31 has a nice property –
        its multiplication can be replaced by a bitwise shift
        which is faster than the standard multiplication"
        */
    }


}
