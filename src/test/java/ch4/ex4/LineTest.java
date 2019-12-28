package ch4.ex4;

import ch2.ex5ex6.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LineTest {

    @Test
    void getCenter() {
        Point pointFrom = new Point(0, 0);
        Point pointTo = new Point(10, 10);

        Shape testLine = new Line(pointFrom, pointTo);

        assertTrue(testLine.getCenter().equals(new Point(5, 5)));
        //assertEquals(new Point(5,5), testLine.getCenter());

    }
}