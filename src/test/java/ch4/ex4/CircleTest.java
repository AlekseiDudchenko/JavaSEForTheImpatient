package ch4.ex4;

import ch2.ex5ex6.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void getCenter() {
        Point newPoint = new Point(1,2);
        Shape myCircle = new Circle(newPoint, 10);

        assertEquals(myCircle.getCenter(), newPoint);

    }
}