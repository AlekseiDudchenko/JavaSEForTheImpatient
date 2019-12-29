package ch4.ex4;

import ch2.ex5ex6.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RectangleTest {

    @Test
    void getCenter() {
        Point topLeftPoint = new Point(5,10);
        Shape testRectangle = new Rectangle(topLeftPoint, 20, 30);

        assertTrue(new Point(15,-5).equals(testRectangle.getCenter()));
    }
}