package ch3.ex6;

import java.math.BigInteger;

/**
 * The SquareSequence class doesn’t actually deliver an infinite sequence of
 * squares due to integer overflow. Specifically, how does it behave? Fix the
 * problem by defining a Sequence<T> interface and a SquareSequence class that
 * implements Sequence<BigInteger>.
 */

public class SquareSequence implements Sequence<BigInteger> {

    private BigInteger value = BigInteger.ONE;

    @Override
    public BigInteger next() {
        return value.multiply(value.add(BigInteger.ONE));
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
