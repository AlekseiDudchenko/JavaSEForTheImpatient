package ch3.ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitSequenceTest {

    @Test
    void nextandHasNext(){
        DigitSequence ds = new DigitSequence(123);
        assertTrue(ds.hasNext());
        assertEquals(3, ds.next());
        assertEquals(2, ds.next());
        assertEquals(1, ds.next());
        assertFalse(ds.hasNext());
    }

    @Test
    void average(){
        IntSequence digitSequence  = new DigitSequence(1234);
        assertEquals(3.5, IntSequence.average(digitSequence,2));
        assertEquals(3.5, IntSequence.average(digitSequence,2));
        assertEquals((double)(1+2+3+4)/4, IntSequence.average(digitSequence,4));
        assertEquals((double)(1+2+3+4)/4, IntSequence.average(digitSequence,10));
    }

}