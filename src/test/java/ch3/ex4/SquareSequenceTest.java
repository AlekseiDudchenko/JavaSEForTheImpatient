package ch3.ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareSequenceTest {

    @Test
    void averageTest(){
        SquareSequence squareSequence = new SquareSequence();
        double avg = Sequence.average(squareSequence, 2);
        assertEquals(2.5, avg);
        assertEquals(1, Sequence.average(squareSequence,1));
    }

}