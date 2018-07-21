package lesson4;

import java.util.Arrays;

/**
 * Created by Zhenya on 21.07.2018.
 */
public class Task2 {

    public static void main(String[] args) {
        int array[] = {1, 1, 1, 1, 1, 1, 9, 1, 1, 1, 1, 5, 4, 8, 3, 7, 4, 6, 7, 0};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(deleteDuplicateValues(array)));
    }

    private static int[] deleteDuplicateValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int valueI = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (valueI == array[j]) {
                    array[j] = 0;
                    array[i] = 0;
                }
            }
        }
        return array;
    }
}
