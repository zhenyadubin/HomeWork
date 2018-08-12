package lesson15;

import java.util.Random;

/**
 * Created by Zhenya on 10.08.2018.
 */
public final class RandomUtil {
    private RandomUtil() {
    }

    public static int getRandomValue(int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue) + 1;
    }

    public static int getRandomValueForDumpSize(int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue);
    }

    public static Robot getRandomDetail() {
        Robot[] robot = Robot.values();
        Random random = new Random();
        int index = random.nextInt(robot.length);
        return robot[index];
    }
}
