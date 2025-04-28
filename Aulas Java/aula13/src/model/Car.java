package model;

public final class Car extends Vehicle{
    private String engine;

    public Car(String brand, String model, int year, Color color, String engine) {
        super(brand, model, year, color);
        this.engine = engine;
    }

    public String start(){
        return "Car " + brand + " " + model + " is starting";
    }

    @Override
    public String move(){
        return "Car is moving";
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + "]";
    }



}
