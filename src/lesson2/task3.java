package lesson2;

import java.util.Scanner;

/**
 * Created by Zhenya on 13.07.2018.
 */
public class task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a: ");
        int numberA = scanner.nextInt();
        System.out.println("Введите число b: ");
        int numberB = scanner.nextInt();
        System.out.println("Введите число c: ");
        int numberC = scanner.nextInt();

        if (isPositive(numberA)) {

            if (isPositive(discriminant(numberA, numberB, numberC))) {
                System.out.println("X1 = " + ((-numberB + (Math.pow((discriminant(numberA, numberB, numberC)), 0.5))) / 2 * numberA));
                System.out.println("X2 = " + ((-numberB - (Math.pow((discriminant(numberA, numberB, numberC)), 0.5))) / 2 * numberA));
            } else if (isZero(discriminant(numberA, numberB, numberC))) {
                System.out.println("X1 & X2 = " + (-(numberB / 2 * numberA)));
            } else {
                System.out.println(" Действительных корней нет ");
            }
        } else {
            System.out.println("Введён неверный формат уравнения!!");
            return;
        }
    }

    public static boolean isPositive (double number) {
        if ( number > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isZero (double number) {
        if ( number == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double discriminant (double a, double b, double c) {
        return b * b - 4 * a * c;
    }
}
