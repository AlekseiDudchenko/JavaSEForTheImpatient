package ch3.ex4ex5;

public interface Sequence {

    default boolean hasNext(){
        return true;
    };

    int next();

    void resetIndex();

    static Sequence digitsOf(int n ){
        return new DigitSequence(n);
    };

    static double average(Sequence seq, int n) {
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
