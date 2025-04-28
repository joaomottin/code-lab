package model;

public abstract class Vehicle {
    protected String brand, model;
    protected int year;
    protected Color color;

    public Vehicle(String brand, String model, int year, Color color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public abstract String move();

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle [brand=" + brand + ", model=" + model + ", year=" + year + ", color=" + color + "]";
    }
    
}
