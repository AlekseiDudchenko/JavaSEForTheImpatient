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

    void resetIndex();

    static IntSequence of(int a0, int a1, int a2, int a3, int a4, int a5){
        return new DigitSequence(a0*100000+a1*10000*a2*1000+a3*100+a4*10+a5);
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

}
