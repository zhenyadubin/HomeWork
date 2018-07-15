package lesson2;

import java.util.Scanner;

/**
 * Created by Zhenya on 13.07.2018.
 */
public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сторону дома №1 a: ");
        int sideA = scanner.nextInt();
        System.out.println("Введите сторону дома №1 b: ");
        int sideB = scanner.nextInt();

        System.out.println("Введите сторону дома №2 c: ");
        int sideC = scanner.nextInt();
        System.out.println("Введите сторону дома №2 d: ");
        int sideD = scanner.nextInt();

        System.out.println("Введите сторону участка e: ");
        int sideE = scanner.nextInt();
        System.out.println("Введите сторону участка f: ");
        int sideF = scanner.nextInt();

        if (isPositive(sideA) || isPositive(sideB) || isPositive(sideC) || isPositive(sideD) || isPositive(sideE) || isPositive(sideF)) {
            System.out.println(" Неверные размеры!! ");
            return;
        } else {
            if (isFirstHouse(sideA,sideB,sideE,sideF) && isSecondHousee(sideA,sideB,sideC,sideD,sideE,sideF)) {
                System.out.println("Влезло");
            } else {
                System.out.println("Не влезло");
            }
        }

    }

    public static boolean isFirstHouse ( int sideA, int sideB, int sideE, int sideF ) {
        if ( ((sideA <= sideE) && (sideA <= sideF)) || ((sideB <= sideE) && (sideB <= sideF)) ) {
                return true;
        } else {
                return false;
            }
        }

    public static boolean isSecondHousee ( int sideA, int sideB, int sideC, int sideD, int sideE, int sideF) {
        if ( ((sideC <= sideE) && (sideC <= (sideF - sideA))) || ((sideD <= sideE) && (sideD <= (sideF - sideA))) ) {
                return true;
        } else if ( ((sideC <= sideF) && (sideC <= (sideE - sideB))) || ((sideD <= sideF) && (sideD <= (sideE - sideB))) ) {
                return true;
        } else {
                return false;
        }
    }

    public static boolean isPositive (double number) {
        if ( number > 0) {
            return false;
        } else {
            return true;
        }
    }
}

