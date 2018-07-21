package lesson4;

import java.util.Arrays;

/**
 * Created by Zhenya on 21.07.2018.
 */
public class Task4 {

    public static void main(String[] args) {
        int[][] doubleArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {11, 12, 13, 14, 15}, {5}, {4, 9, 11, 5}};
        for (int[] aDoubleArray : doubleArray) {
            System.out.println(Arrays.toString(aDoubleArray));
        }
        System.out.println(Arrays.toString(toStringArray(doubleArray)));
    }

    public static int[] toStringArray(int[][] doubleArray) {
        int[] stringArray = new int[arrayIndexSum(doubleArray)];
        int count = 0;
        for (int[] aDoubleArray : doubleArray) {
            for (int anADoubleArray : aDoubleArray) {
                stringArray[count] = anADoubleArray;
                count++;
            }
        }
        return stringArray;
    }

    public static int arrayIndexSum(int[][] array) {
        int count = 0;
        for (int[] anArray : array) {
            for (int j = 0; j < anArray.length; j++) {
                count++;
            }
        }
        return count;
    }
}
