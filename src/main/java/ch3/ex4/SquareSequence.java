package ch3.ex4;

public class SquareSequence implements Sequence {

    private int i;

    @Override
    public int next() {
        i++;
        return i * i;
    }

    public void resetIndex(){
        i = 0;
    };
}
