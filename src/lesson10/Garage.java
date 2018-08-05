package lesson10;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhenya on 03.08.2018.
 */
public final class Garage {

    private Map<Car, Integer> garage = new HashMap<>();

    public void comeToTheGarage(Car car) {
        if (garage.containsKey(car)) {
            garage.put(car, garage.get(car) + 1);
        } else {
            garage.put(car, 1);
        }
    }

    public void leftTheGarage(Car car) {
        if (garage.containsKey(car) && garage.get(car) > 1) {
            garage.put(car, garage.get(car) - 1);
        } else if (garage.containsKey(car) && garage.get(car) == 1) {
            garage.remove(car);
        } else {
            System.out.println("На стоянке нет такой машины!!");
        }
    }

    public int howManyUniqueCar(Car car) {
        int numberOfUniqueCar = 0;

        if (garage.containsKey(car)) {
            numberOfUniqueCar = garage.get(car);
        }
        return numberOfUniqueCar;
    }

    public void howManyCarInTheGarage() {
        for (Map.Entry entry : garage.entrySet()) {
            System.out.println(entry.getKey().toString() + " ---------------> " + entry.getValue());
        }
        System.out.println();
    }
}
