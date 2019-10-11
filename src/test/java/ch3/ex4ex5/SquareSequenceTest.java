package ch3.ex4ex5;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareSequenceTest {

    @Test
    void averageTest(){
        SquareSequence squareSequence = new SquareSequence();
        double avg = Sequence.average(squareSequence, 2);
        assertEquals(2.5, avg);
        assertEquals(1, Sequence.average(squareSequence,1));
    }

    @Test
    void nextTest(){
        SquareSequence squareSequence = new SquareSequence();
        IntStream.range(1, 100).forEach(n -> {
            assertEquals(n*n, squareSequence.next());
        });

    }

}