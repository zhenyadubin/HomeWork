package lesson10;

/**
 * Created by Zhenya on 03.08.2018.
 */
public class Suv extends Car {

    private int year;
    private String model;
    private String brand;
    private double engineCapacity;
    private Drive drive;

    public Suv(int year, String model, String brand, double engineCapacity, Drive drive) {
        this.year = year;
        this.model = model;
        this.brand = brand;
        this.engineCapacity = engineCapacity;
        this.drive = drive;
    }

    @Override
    public String toString() {
        return "Suv{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", drive=" + drive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Suv suv = (Suv) o;

        if (year != suv.year) return false;
        if (Double.compare(suv.engineCapacity, engineCapacity) != 0) return false;
        if (model != null ? !model.equals(suv.model) : suv.model != null) return false;
        if (brand != null ? !brand.equals(suv.brand) : suv.brand != null) return false;
        return drive == suv.drive;
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
