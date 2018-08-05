package lesson10;

/**
 * Created by Zhenya on 03.08.2018.
 */
public class Caravan extends Car {

    private int year;
    private String model;
    private String brand;
    private double engineCapacity;
    private Drive drive;

    public Caravan(int year, String model, String brand, double engineCapacity, Drive drive) {
        this.year = year;
        this.model = model;
        this.brand = brand;
        this.engineCapacity = engineCapacity;
        this.drive = drive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Caravan caravan = (Caravan) o;

        if (year != caravan.year) return false;
        if (Double.compare(caravan.engineCapacity, engineCapacity) != 0) return false;
        if (model != null ? !model.equals(caravan.model) : caravan.model != null) return false;
        if (brand != null ? !brand.equals(caravan.brand) : caravan.brand != null) return false;
        return drive == caravan.drive;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = year;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        temp = Double.doubleToLongBits(engineCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (drive != null ? drive.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Caravan{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", drive=" + drive +
                '}';
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public Drive getDrive() {
        return drive;
    }
}
