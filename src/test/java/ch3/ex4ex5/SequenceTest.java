package ch3.ex4ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SequenceTest {

    @Test
    void digitOfTest() {
        Sequence sequence; // = new IntSequence();
        sequence = Sequence.digitsOf(13464);
        assertEquals(4, sequence.next());
        assertEquals(6, sequence.next());
        assertEquals(4, sequence.next());
        assertEquals(3, sequence.next());
        assertEquals(1, sequence.next());
    }
}