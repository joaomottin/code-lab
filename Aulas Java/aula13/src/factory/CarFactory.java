package factory;

import model.Car;
import model.Color;

public class CarFactory {
    public static Car createCar(String brand, String model, int year, Color color, String engine){
        return new Car(brand, model, year, color, engine);
    }
}
