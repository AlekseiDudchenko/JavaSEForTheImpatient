package ch2.ex10;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {

    public static int randomElement(int[] array){
        return array[new Random().nextInt(array.length)];
    }

    public static int randomElement(ArrayList<Integer> arrayList){
        return arrayList.get(new Random().nextInt(arrayList.size()));
    }


}
