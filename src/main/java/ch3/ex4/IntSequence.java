package ch3.ex4;

import java.util.ArrayList;
/**
 * Implement a static of method of the Sequence class that yields a sequence
 * with the arguments. For example, Sequence.of(3, 1, 4, 1, 5, 9) yields a
 * sequence with six values. Extra credit if you return an instance of an
 * anonymous inner class.
 *
 * Add a static method with the name constant of the IntSequence class that
 * yields an infinite constant sequence. For example, IntSequence.constant(1)
 * yields values 1 1 1..., ad infinitum. Extra credit if you do this with a
 * lambda expression.
 */

public class IntSequence implements Sequence {

    private int index;
    private ArrayList<Integer> sequence = new ArrayList<>();

    static IntSequence of(int... values){
        IntSequence intSequence = new IntSequence();
        for (int value:values){
            intSequence.add(value);
        }
        return intSequence;
    };

    private void add(int n){
        sequence.add(n);
    }

    @Override
    public boolean hasNext(){
        return index < sequence.size();
    }

    @Override
    public int next() {
        try {
            index++;
            return sequence.get(index-1);
        } catch (Exception e)
        {
            System.out.println("Out of index");
        }
        return 0;
    }

    @Override
    public void resetIndex() {
        index = 0;
    }
}
