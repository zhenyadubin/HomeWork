package lesson15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhenya on 11.08.2018.
 */
public class MadScientist {
    private final Map<Robot, Integer> storeHouse = new HashMap<>(Robot.values().length);

    public void takeDetailsFromMinion(List<Robot> list) {
        for (Robot aContentsOfMinionsBag : list) {
            storeHouse.merge(aContentsOfMinionsBag, 1, (a, b) -> a + b);
        }
    }

    public int scientistBuilt() {
        int minNumberOfMinDetail = 0;
        Map.Entry<Robot, Integer> minDetail = null;
        if (storeHouse.size() == Robot.values().length) {
            for (Map.Entry<Robot, Integer> detail : storeHouse.entrySet()) {
                if (minDetail == null || detail.getValue().compareTo(minDetail.getValue()) < 0) {
                    minDetail = detail;
                }
            }
            minNumberOfMinDetail = minDetail.getValue();
        }
        return minNumberOfMinDetail;
    }

    public int allDetails() {
        int allDetailsOfScientist = 0;
        for (Map.Entry<Robot, Integer> detail : getStoreHouse().entrySet()) {
            allDetailsOfScientist += detail.getValue();
        }
        return allDetailsOfScientist;
    }

    public Map<Robot, Integer> getStoreHouse() {
        return storeHouse;
    }
}
