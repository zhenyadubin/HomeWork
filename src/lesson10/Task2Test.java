package lesson10;

/**
 * Created by Zhenya on 03.08.2018.
 */
public class Task2Test {

    public static void main(String[] args) {
        Garage garage = getGarage();
        garage.leftTheGarage(new Suv(1998, "Toyota", "Land Cruser", 2.4, Drive.FOUR_WD));
        garage.leftTheGarage(new Suv(1998, "Toyota", "Land Cruser", 2.4, Drive.FOUR_WD));
        garage.comeToTheGarage(new Suv(1998, "Toyota", "Land Cruser", 2.4, Drive.FOUR_WD));
        garage.comeToTheGarage(new Suv(1998, "Toyota", "Land Cruser", 2.4, Drive.FOUR_WD));
        System.out.println(garage.howManyUniqueCar(new Suv(1998, "Toyota", "Land Cruser", 2.4, Drive.FOUR_WD)));
        System.out.println(garage.howManyUniqueCar(new Caravan(1998, "Mersedes", "Benc", 1.6, Drive.TWO_WD)));
        garage.comeToTheGarage(new Caravan(1998, "Mersedes", "Benc", 1.6, Drive.TWO_WD));
        System.out.println(garage.howManyUniqueCar(new Caravan(1998, "Mersedes", "Benc", 1.6, Drive.TWO_WD)));
        garage.howManyCarInTheGarage();
    }

    private static Garage getGarage() {
        Garage garage = new Garage();
        garage.comeToTheGarage(new Caravan(1998, "Mersedes", "Benc", 1.6, Drive.TWO_WD));
        garage.comeToTheGarage(new Suv(1998, "Toyota", "Land Cruser", 2.4, Drive.FOUR_WD));
        garage.comeToTheGarage(new Caravan(1998, "Mersedes", "Benc", 1.6, Drive.TWO_WD));
        garage.comeToTheGarage(new PassengerCar(2000, "Mersedes", "Benc", 1.4, Drive.TWO_WD));
        garage.comeToTheGarage(new SportsCar(2014, "Ferrari", "Enzo", 6.0, Drive.FOUR_WD));
        garage.comeToTheGarage(new PassengerCar(1998, "Mersedes", "Benc", 1.6, Drive.TWO_WD));
        garage.comeToTheGarage(new Suv(2014, "Mersedes", "Benc", 3.2, Drive.FOUR_WD));
        return garage;
    }
}
