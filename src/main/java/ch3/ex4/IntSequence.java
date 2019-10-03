package ch3.ex4;

import java.util.ArrayList;

public interface IntSequence {

    boolean hasNext();

    int next();

    int of(IntSequence seq);

    static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;

        while (seq.hasNext() && count < n) {
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum / count;
    }

}
