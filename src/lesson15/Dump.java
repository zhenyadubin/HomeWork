package lesson15;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhenya on 11.08.2018.
 */
public class Dump {
    private List<Robot> dump = new ArrayList<>();

    public Dump(int initialSize) {
        for (int i = 0; i < initialSize; i++) {
            dump.add(i, RandomUtil.getRandomDetail());
        }
    }

    public List<Robot> getDump() {
        return dump;
    }
}
