package lesson3;

import java.util.Scanner;

/**
 * Created by Zhenya on 15.07.2018.
 */
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        int number = scanner.nextInt();
        int sum = 0, oststok = 1;

        while ( oststok != 0) {
            oststok = number % 10;
            sum = sum + oststok;
            number = number / 10;
        }

        System.out.println("Сумма чисел равна = " + sum);
    }
}
