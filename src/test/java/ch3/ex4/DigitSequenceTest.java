package ch3.ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitSequenceTest {

    @Test
    void nextAndHasNextTest(){
        DigitSequence ds = new DigitSequence(123);
        assertTrue(ds.hasNext());
        assertEquals(3, ds.next());
        assertEquals(2, ds.next());
        assertEquals(1, ds.next());
        assertFalse(ds.hasNext());
    }

    @Test
    void averageTest(){
        Sequence digitSequence  = new DigitSequence(1234);
        assertEquals(3.5, Sequence.average(digitSequence,2));
        assertEquals(3.5, Sequence.average(digitSequence,2));
        assertEquals((double)(1+2+3+4)/4, Sequence.average(digitSequence,4));
        assertEquals((double)(1+2+3+4)/4, Sequence.average(digitSequence,10));
    }

    @Test
    void getLengthsTest(){
        DigitSequence ds = new DigitSequence(12345);
        assertEquals(5, ds.getLengths());
    }

    @Test
    void equalsTest(){
        DigitSequence firstDS = new DigitSequence(123);
        DigitSequence secondDS = new DigitSequence(123);
        assertTrue(firstDS.equals(secondDS));
        assertTrue(secondDS.equals(firstDS));

        DigitSequence thirdDS = new DigitSequence(1);
        assertFalse(firstDS.equals(thirdDS));
        assertFalse(thirdDS.equals(firstDS));

        DigitSequence forthDS = new DigitSequence(111);
        assertFalse(secondDS.equals(forthDS));
        assertFalse(forthDS.equals(secondDS));

        assertTrue(firstDS.equals(secondDS));
        assertTrue(secondDS.equals(firstDS));
    }

}