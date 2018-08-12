package lesson15;

import java.util.Map;

/**
 * Created by Zhenya on 10.08.2018.
 */
public class TestHW {

    public static void main(String[] args) {
        int numberOfNights = 100;
        Dump dump = new Dump(20);
        MadScientist madScientist1 = new MadScientist();
        MadScientist madScientist2 = new MadScientist();
        Thread factory = new Thread(new Factory(dump.getDump(), 4, numberOfNights));
        Thread minion1 = new Thread(new Minion(dump.getDump(), 4, madScientist1, numberOfNights));
        Thread minion2 = new Thread(new Minion(dump.getDump(), 4, madScientist2, numberOfNights));

        System.out.println(dump.getDump());

        factory.start();
        minion1.start();
        minion2.start();
        try {
            factory.join();
            minion1.join();
            minion2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println(madScientist1.getStoreHouse());
        System.out.println(madScientist1.allDetails() + " - все собранные детали первым учёным");

        System.out.println();

        System.out.println(madScientist2.getStoreHouse());
        System.out.println(madScientist2.allDetails() + " - все собранные детали вторым учёным");

        System.out.println();

        System.out.println("1-ый учёный собрал -> " + madScientist1.scientistBuilt() + " роботов");
        System.out.println("2-ой учёный собрал -> " + madScientist2.scientistBuilt() + " роботов");
    }
}
