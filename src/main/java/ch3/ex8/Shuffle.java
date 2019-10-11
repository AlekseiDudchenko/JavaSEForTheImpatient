package ch3.ex8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Implement the method void luckySort(ArrayList<String> strings, Comparator<String>
 * comp) that keeps calling Collections.shuffle on the array list until the elements
 * are in increasing order, as determined by the comparator.
 */

//TODO write tests
public class Shuffle {

    public void luckySort(ArrayList<String> strings, Comparator<String> comp){
        ArrayList<String> sortedStrings = new ArrayList<>(strings);
        sortedStrings.sort(comp);

        while (!strings.equals(sortedStrings)){
            Collections.shuffle(strings);
        }
    }
}
