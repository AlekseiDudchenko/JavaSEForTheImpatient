package ch4.ex1ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LabeledPointTest {

    @Test
    void getLabel() {
        LabeledPoint pointA = new LabeledPoint("A", 1,2);
        assertEquals("A", pointA.getLabel());
        assertEquals(1, pointA.getX());
        assertEquals(2, pointA.getY());
    }

    @Test
    void toStringTest() {
        LabeledPoint pointB = new LabeledPoint("B", 2, 3);
        assertEquals("X = 2.0, Y = 3.0 B", pointB.toString());
        Point pointB2 = new LabeledPoint("B", 2, 3);
        assertEquals("X = 2.0, Y = 3.0 B", pointB2.toString());
    }

    @Test
    void equalsTest(){
        Point pointB = new LabeledPoint("B", 2, 3);
        Point pointC = new LabeledPoint("C", 2, 3);
        Point pointD = new LabeledPoint("D", 24, 31);

        assertEquals(pointB, pointC);
        assertEquals(pointC, pointB);
        assertEquals(pointB, pointB);
        assertNotEquals(pointB, pointD);
        assertNotEquals(pointC, pointD);
    }

}