package ch4.ex4;

import ch2.ex5ex6.Point;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class ShapeTest {

    @Test
    void moveBy() {
        Point testPoint = new Point(2.0,5.0);
        Shape myShape = new Shape(testPoint) {
            @Override
            public Point getCenter() {
                return this.point;
            }
        };

        assertEquals(myShape.getCenter(), testPoint);
        myShape.moveBy(3.0, 5.0);
        assertTrue(myShape.getCenter().equals(new Point(5, 10)));
    }
}