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


}
