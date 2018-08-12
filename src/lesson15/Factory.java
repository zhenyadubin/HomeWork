package lesson15;

import java.util.List;

/**
 * Created by Zhenya on 10.08.2018.
 */
public class Factory implements Runnable {
    private final List<Robot> dump;
    private int maxNumberOfEjectedDetails;
    private int numberOfNights;

    public Factory(List<Robot> dump, int maxNumberOfEjectedDetails, int numberOfNights) {
        this.dump = dump;
        this.maxNumberOfEjectedDetails = maxNumberOfEjectedDetails;
        this.numberOfNights = numberOfNights;
    }

    @Override
    public void run() {
        for (int j = 0; j < numberOfNights; j++) {
            synchronized (dump) {
                int details = RandomUtil.getRandomValue(maxNumberOfEjectedDetails);
                System.out.println("Фабрика передаёт " + details + " детали...");
                for (int i = 0; i < details; i++) {
                    dump.add(RandomUtil.getRandomDetail());
                }
                System.out.println("После передачи, деталей на свалке = " + dump);
                try {
                    dump.wait(1L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                System.out.println("                     " + Thread.currentThread().getName() + "                                " + j);
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
