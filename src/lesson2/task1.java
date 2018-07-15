package lesson2;

import java.util.Scanner;

/**
 * Created by Zhenya on 12.07.2018.
 */
public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день:");
        int day = scanner.nextInt();

        System.out.println("Введите месяц:");
        int month = scanner.nextInt();

        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if ( (0 >= month || month >= 13) || ( 0 >= day || day > numberOfDay(month,year) ) ) {
            System.out.println("Нет такой даты!!");
            return;
        } else {

            if (isEndOfYear(day, month)) {
                year = year + 1;
            } else {
                year = year;
            }

            if (isEndOfMonth(day, year, month) && isEndOfYear(day, month)) {
                month = 1;
                day = 1;
            } else if (isEndOfMonth(day, year, month) && !isEndOfYear(day, month)) {
                month = month + 1;
                day = 1;
            } else {
                month = month;
                day = day + 1;
            }

            System.out.println(day + "." + month + "." + year);
        }

    }

        public static boolean isEndOfYear (int day, int month) {
            if ( day == 31 && month == 12) {
                return true;
            } else {
                return false;
            }
    }

        public static boolean isTemperal (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return  true;
        } else {
            return false;
        }
    }

        public static boolean isEndOfMonth (int day, int year, int month) {
            boolean i = false;
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    if ( day == 30 ) {
                        i = true;
                    } else {
                        i = false;
                    }
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if ( day == 31 ) {
                        i = true;
                    } else {
                        i = false;
                    }
                    break;
                case 2:
                    if ( isTemperal(year) && day == 29) {
                        i = true;
                    } else if ( day == 28 && ! isTemperal(year)) {
                        i = true;
                    } else {
                        i = false;
                    }
                    break;
            }
            return i;
        }

        public static int numberOfDay (int month, int year) {
        int i = 0;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                i = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                i = 31;
                break;
            case 2:
                if (isTemperal(year)) {
                    i = 29;
                } else {
                    i = 28;
                }
                break;
        } return i;
        }
    }


