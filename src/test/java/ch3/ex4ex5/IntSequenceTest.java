package ch3.ex4ex5;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntSequenceTest {


    @Test
    void ofTest() {
        IntSequence intSequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        assertEquals(3, intSequence.next());
        assertEquals(1, intSequence.next());
        assertEquals(4, intSequence.next());
        assertEquals(1, intSequence.next());
        assertEquals(5, intSequence.next());
        assertEquals(9, intSequence.next());
    }

    @Test
    void constantTest() {
        IntSequence intSequence1 = IntSequence.constant(1);
        IntSequence intSequence24 = IntSequence.constant(24);
        IntStream.range(0, 1000).forEachOrdered(n -> {
            assertEquals(1, intSequence1.next());
            assertEquals(24, intSequence24.next());
        });
    }

    @Test
    void hasNext() {
    }

    @Test
    void next() {
    }

    @Test
    void resetIndex() {
    }
}