package model;

public class Car {
    private String brand;
    private String model;
    private int serial;
    public Car() {
    }

    public Car(String brand, String model, int serial) {
        this.brand = brand;
        this.model = model;
        this.serial = serial;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", serial=" + serial +
                '}';
    }
}
