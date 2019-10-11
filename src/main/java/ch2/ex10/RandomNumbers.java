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
        return (array.length == 0) ? 0 : array[new Random().nextInt(array.length)];
    }

    public static int randomElement(ArrayList<Integer> arrayList) {
        return (arrayList.isEmpty()) ? 0 : arrayList.get(new Random().nextInt(arrayList.size()));
    }
}
