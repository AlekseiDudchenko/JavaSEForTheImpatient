package ch3.ex4;

/**
 * Implement a static of method of the IntSequence class that yields a sequence
 * with the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a
 * sequence with six values. Extra credit if you return an instance of an
 * anonymous inner class.
 */

public interface IntSequence {

    default boolean hasNext(){
        return true;
    };

    int next();

    static int of(IntSequence seq){
        return 0;
    };

    static IntSequence digitsOf(int n ){
        return new DigitSequence(n);
    };

    static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;

        while (seq.hasNext() && count < n) {
            count++;
            sum += seq.next();
        }
        seq.resetIndex();
        return count == 0 ? 0 : sum / count;
    }

    void resetIndex();

}
