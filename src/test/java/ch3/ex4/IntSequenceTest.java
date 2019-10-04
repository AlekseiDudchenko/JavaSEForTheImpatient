package ch3.ex4;

import org.junit.jupiter.api.Test;

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
    void hasNext() {
    }

    @Test
    void next() {
    }

    @Test
    void resetIndex() {
    }
}