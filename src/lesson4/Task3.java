package lesson4;

import java.util.Arrays;

/**
 * Created by Zhenya on 21.07.2018.
 */
public class Task3 {

    public static void main(String[] args) {
        int[] array1 = {2, 8};
        int[] array2 = {5, 9, 7, 8, 5};
        System.out.println(Arrays.toString(connectFirstAndSecondArrays(array1, array2)));
    }

    private static int[] connectFirstAndSecondArrays(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        if (array1.length > array2.length) {
            for (int j = 0, i = 0; i < array2.length; j = j + 2, i++) {
                array3[j] = array1[i];
                array3[j + 1] = array2[i];
            }
            int unusedValues = array1.length - array2.length;

            for (int i = (array3.length - unusedValues), j = array1.length - unusedValues; i < array3.length; i++, j++) {
                array3[i] = array1[j];
            }
        } else {
            for (int j = 0, i = 0; i < array1.length; j = j + 2, i++) {
                array3[j] = array1[i];
                array3[j + 1] = array2[i];
            }
            int ostatokElementov = array2.length - array1.length;

            for (int i = (array3.length - ostatokElementov), j = array2.length - ostatokElementov; i < array3.length; i++, j++) {
                array3[i] = array2[j];
            }
        }
        return array3;
    }
}
