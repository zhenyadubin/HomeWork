package lesson4;

import java.util.Arrays;

/**
 * Created by Zhenya on 21.07.2018.
 */
public class Task1 {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        System.out.println(Arrays.toString(array));

        for (int j = 0; j < 3; j++) {
            System.out.println(Arrays.toString(moveValues(array)));
        }
    }

    private static int[] moveValues(int[] array) {
        int lastElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;
        return array;
    }
}
