package lesson15;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhenya on 11.08.2018.
 */
public class Minion implements Runnable {
    private final List<Robot> dump;
    private List<Robot> bag = new ArrayList<>();
    private int maxNumberOfMovedDetails;
    private MadScientist madScientist;
    private int numberOfNights;

    public Minion(List<Robot> dump, int maxNumberOfMovedDetails, MadScientist madScientist, int numberOfNights) {
        this.dump = dump;
        this.maxNumberOfMovedDetails = maxNumberOfMovedDetails;
        this.madScientist = madScientist;
        this.numberOfNights = numberOfNights;
    }

    @Override
    public void run() {
        for (int j = 0; j < numberOfNights; j++) {
            int bagSize = RandomUtil.getRandomValue(maxNumberOfMovedDetails);
            System.out.println(Thread.currentThread().getName() + " хочет взять " + bagSize + " деталей");
            synchronized (dump) {
                for (int i = 0; i < bagSize; i++) {
                    if (dump.size() > 0) {
                        System.out.println(Thread.currentThread().getName() + " берёт деталь");
                        bag.add(dump.remove(RandomUtil.getRandomValueForDumpSize(dump.size())));
                        try {
                            dump.wait(1L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                dump.notify();
            }
            System.out.println(Thread.currentThread().getName() + " деталей в сумке " + bag);
            System.out.println(Thread.currentThread().getName() + " передаёт детали учёному");
            madScientist.takeDetailsFromMinion(bag);
            bag.clear();
            try {
                System.out.println("                     " + Thread.currentThread().getName() + "                                " + j);
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
