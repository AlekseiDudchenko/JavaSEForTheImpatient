package ch3.ex6;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SquareSequenceTest {


    @Test
    void next(){
        SquareSequence squareSequence = new SquareSequence();
        IntStream.range(1, 100).forEach(n -> {
            assertEquals(BigInteger.valueOf(n*n), squareSequence.next());
        });
    }

    @Test
    void hasNextTest(){
        SquareSequence squareSequence = new SquareSequence();
        assertEquals(true, squareSequence.hasNext());
    }

}