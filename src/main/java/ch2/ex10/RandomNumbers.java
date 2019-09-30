package ch2.ex10;

import java.util.ArrayList;
import java.util.Random;

/**
 * In the RandomNumbers class, provide two static methods randomElement that get
 * a random element from an array or array list of integers. (Return zero if
 * the array or array list is empty.) Why couldn’t you make these methods
 * into instance methods of int[] or ArrayList<Integer>?
 */


public class RandomNumbers {

    public static int randomElement(int[] array){
        if (array.length == 0) return 0;
        else
            return array[new Random().nextInt(array.length)];
    }

    public static int randomElement(ArrayList<Integer> arrayList){
        if (arrayList.isEmpty()) return 0;
        else
            return arrayList.get(new Random().nextInt(arrayList.size()));
    }


}
