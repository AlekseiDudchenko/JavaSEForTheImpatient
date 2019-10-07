package ch2.ex5;

//import org.junit.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void constructors() {
        Point defaultPoint = new Point();
        assertEquals(0, defaultPoint.getX());
        assertEquals(0, defaultPoint.getY());
        Point usersPoint = new Point(10,-15);
        assertEquals(10, usersPoint.getX());
        assertEquals(-15, usersPoint.getY());
    }

    @Test
    void translateTest(){
        Point p = new Point(2,5);
        assertEquals(2, p.getX());
        assertEquals(5,p.getY());
        p.translate(2,5);
        assertNotEquals(4, p.getX());
        assertNotEquals(10, p.getY());
        assertEquals(2,p.getX());
        assertEquals(5, p.getY());
        p = p.translate(1,2);
        assertEquals(3, p.getX());
        assertEquals(7,p.getY());
        Point p1 = p;
        assertEquals(p.getX(), p1.getX());
        assertEquals(p.getY(), p.getY());
    }

    @Test
    void translateNegative(){
        Point p = new Point(2,3);
        p = p.translate(-10,-5);
        assertEquals(-8,p.getX());
        assertEquals(-2,p.getY());
    }

    @Test
    void equals(){
        Point firstPoint = new Point();
        Point secondPoint = new Point();
        assertTrue(firstPoint.equals(secondPoint));
        assertTrue(secondPoint.equals(firstPoint));
        firstPoint = firstPoint.translate(1,5);
        assertFalse(firstPoint.equals(secondPoint));
        assertTrue(firstPoint.equals(new Point(1,5)));
        assertFalse(firstPoint.equals(new Point()));
        assertTrue(secondPoint.equals(new Point()));
    }

    @Test
    void scaleTest(){
        Point p = new Point(1,1);
        assertTrue(p.scale(2).equals(new Point(2,2)));
        assertTrue(p.equals(new Point(1,1)));
        Point p1 = p.scale(-5);
        assertTrue(p1.equals(new Point(-5,-5)));
    }

    @Test
    void testProvidedByTheBook() {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        assertEquals(2, p.getX());
        assertEquals(3.5, p.getY());
    }

    @Test
    void translateModifying() {
        Point p = new Point(10,15);
        p.translateMutate(-2, 5);
        assertTrue(p.equals(new Point(8,20)));
    }

    @Test
    void scaleModifying() {
        Point p = new Point(10,15);
        p.scaleMutate(-2);
        assertTrue(p.equals(new Point(-20,-30)));
    }

    @Test
    void toStringTest(){
        Point p = new Point(10.89, 1);
        assertEquals("x = 10.89, y = 1.0", p.toString());
    }

    @org.junit.jupiter.api.Test
    void getX() {
    }

    @org.junit.jupiter.api.Test
    void getY() {
    }

    @org.junit.jupiter.api.Test
    void translate() {
    }

    @org.junit.jupiter.api.Test
    void scale() {
    }

    @org.junit.jupiter.api.Test
    void translateMutate() {
    }

    @org.junit.jupiter.api.Test
    void scaleMutate() {
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}