package lesson3;

import java.util.Scanner;

/**
 * Created by Zhenya on 15.07.2018.
 */
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дней: ");

        int numberOfDay = scanner.nextInt();
        int maxNumberOfWater = 0;
        int sumOfWater = 0;

        for ( int i = 1; i <= numberOfDay; i++ ) {
            System.out.println( "Введите количество осадков в " + i + " день");
            int numberOfWater = scanner.nextInt();
            sumOfWater = sumOfWater + numberOfWater;
            if ( maxNumberOfWater < numberOfWater) {
                maxNumberOfWater = numberOfWater;
            }
        }

        System.out.println(" Количество дней: " + numberOfDay);
        System.out.println(" Общее количество осадков: " + sumOfWater);
        System.out.println(" Среднее количество осадков: " + (double)sumOfWater/numberOfDay);
        System.out.println(" Наибольшее количество осадков: " + maxNumberOfWater);
    }
}
