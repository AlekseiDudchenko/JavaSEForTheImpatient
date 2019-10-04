package ch3.ex4;

public class SquareSequence implements IntSequence{

    private int i;

    @Override
    public int next() {
        i++;
        return i * i;
    }

//    public int of(IntSequence sequence){
//        return 0;
//    }

    public void resetIndex(){
        i = 0;
    };
}
