package ch3.ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareSequenceTest {

    @Test
    void averageTest(){
        SquareSequence squareSequence = new SquareSequence();
        double avg = IntSequence.average(squareSequence, 2);
        assertEquals(2.5, avg);
        assertEquals(1, IntSequence.average(squareSequence,1));

    }

}