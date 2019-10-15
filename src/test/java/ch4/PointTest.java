package ch4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PointTest {

    @Test
    void getX() {
    }

    @Test
    void getY() {
    }

    @Test
    void testEquals() {
        Point point1 = new Point(1,5);
        Point point2 = new Point(1,3);
        Point point3 = new Point(3,98);
        Point point4 = new Point(1,5);
        Point point5 = new Point(5,5);
        Object object = new Object();
        Point labeledPoint = new LabeledPoint("A", 1,5);
        Point labeledPoint2 = new LabeledPoint("A", 5,1);

        assertEquals(point1, point4);
        assertEquals(point1, labeledPoint);
        assertNotEquals(point1, point2);
        assertNotEquals(point1, point3);
        assertNotEquals(point1, point5);
        assertNotEquals(point1, object);
        assertNotEquals(point1, labeledPoint2);
    }
}