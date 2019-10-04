package ch3.ex4;

public class DigitSequence implements IntSequence {

    private int number;

    private final int originalNumber;

    public DigitSequence(int n){
        originalNumber = n;
        number = n;
    }

    @Override
    public boolean hasNext() {
        return number !=0;
    }

    @Override
    public int next() {
        int result = number % 10;
        number /= 10;
        return result;
    }

    @Override
    public void resetIndex(){
        number = originalNumber;
    }

    /**
     *
     * @return number of elements
     */
    protected int getLengths(){
        int lengths = 0;
        while (hasNext()){
            lengths++;
            next();
        }
        resetIndex();
        return lengths;
    }

    /**
     * Sequences are equal if they have the same digits in the same order
     * @param otherDS
     * @return
     */
    public boolean equals(DigitSequence otherDS){
        if (this.getLengths() == otherDS.getLengths()){
            boolean equals = false;
            while (this.hasNext()){
                if (this.next() == otherDS.next())
                    equals = true;
                else {
                    this.resetIndex();
                    otherDS.resetIndex();
                    return false;
                }
            }
            this.resetIndex();
            otherDS.resetIndex();
            return equals;
        } else {
            return false;
        }
    }


}
