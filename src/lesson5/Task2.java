package lesson5;

/**
 * Created by Zhenya on 21.07.2018.
 */
public class Task2 {

    public static void main(String[] args) {
        String rome = "CDXXXIX";
        System.out.println(rome + " --> " + romeToArab(rome));
    }

    public static int romeToArab(String rome) {
        int arab = 0;
        while (rome.length() != 0) {
            String romeNumber;
            if (rome.startsWith("IV") || rome.startsWith("IX")
                    || rome.startsWith("XL") || rome.startsWith("XC")
                    || rome.startsWith("CD") || rome.startsWith("CM")) {
                romeNumber = rome.substring(0, 2);
                switch (romeNumber) {
                    case "IV":
                        arab = arab + 4;
                        break;
                    case "IX":
                        arab = arab + 9;
                        break;
                    case "XL":
                        arab = arab + 40;
                        break;
                    case "XC":
                        arab = arab + 90;
                        break;
                    case "CD":
                        arab = arab + 400;
                        break;
                    case "CM":
                        arab = arab + 900;
                        break;
                    default:
                        break;
                }
                rome = rome.substring(2, rome.length());
            } else if (rome.startsWith("I") || rome.startsWith("V")
                    || rome.startsWith("X") || rome.startsWith("L")
                    || rome.startsWith("C") || rome.startsWith("D")
                    || rome.startsWith("M")) {
                romeNumber = rome.substring(0, 1);

                switch (romeNumber) {
                    case "I":
                        arab = arab + 1;
                        break;
                    case "V":
                        arab = arab + 5;
                        break;
                    case "X":
                        arab = arab + 10;
                        break;
                    case "L":
                        arab = arab + 50;
                        break;
                    case "C":
                        arab = arab + 100;
                        break;
                    case "D":
                        arab = arab + 500;
                        break;
                    case "M":
                        arab = arab + 1000;
                        break;
                    default:
                        break;
                }
                rome = rome.substring(1, rome.length());
            }
        }
        return arab;
    }
}
