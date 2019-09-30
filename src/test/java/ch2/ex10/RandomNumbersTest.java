package ch2.ex10;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumbersTest {

    @Test
    void randomFromTheSame(){
        int[] array = new int[]{2,2,2,2,2,2};
        IntStream.range(0, 50).forEach(n -> {
            assertEquals(2,RandomNumbers.randomElement(array));
        });
    }

    @Test
    void randomFromDifferent(){
        int[] array = new int[]{1,2,3,1,2,3,1,2,3,1,2,3};
        int[] array2 = new  int[]{4,5,6,7,8,9};
        IntStream.range(0, 20).forEach(n -> {
            int randomInt = RandomNumbers.randomElement(array);
            assertTrue(randomInt == 1 || randomInt == 2 ||  randomInt == 3);
            int randomInt2 = RandomNumbers.randomElement(array2);
            assertFalse(randomInt2 == 1 ||  randomInt2 == 2 || randomInt2 == 3);
        });
    }

    @Test
    void randomArrayListFromTheSame(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        IntStream.range(0, 50).forEachOrdered(n -> {arrayList.add(1);});
        IntStream.range(0, 10).forEachOrdered(n -> {
            assertEquals(1,RandomNumbers.randomElement(arrayList));
        });
    }

    @Test
    void randomArrayListFromDiff(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        IntStream.range(1, 4).forEachOrdered(n -> {arrayList.add(n);});
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        IntStream.range(4, 10).forEachOrdered(n -> {arrayList2.add(n);});
        IntStream.range(0, 50).forEach(n -> {
            int randomInt = RandomNumbers.randomElement(arrayList);
            assertTrue(randomInt == 1 || randomInt == 2 ||  randomInt == 3);
            randomInt = RandomNumbers.randomElement(arrayList2);
            assertFalse(randomInt == 1 ||  randomInt == 2 || randomInt == 3);
        });
    }

    @Test
    void emptyArrayList(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        assertEquals(0, RandomNumbers.randomElement(arrayList));
    }

    @Test
    void emptyArray(){
        int[] array = new int[]{};
        assertEquals(0, RandomNumbers.randomElement(array));
    }

}