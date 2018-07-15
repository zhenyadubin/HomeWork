package lesson3;

import java.util.Scanner;

/**
 * Created by Zhenya on 15.07.2018.
 */
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        int number = scanner.nextInt();
        int sum = 1;

        fibonachi(sum, number);

    }

    public static void fibonachi(int sum, int number) {
        for (int i = 0; sum < number; i = sum - i) {
            if (sum < number) {
                System.out.print(sum + " ");
            } else {
                break;
            }
            sum = sum + i;
        }
    }
}
