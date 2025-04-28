package factory;

import model.Color;
import model.Motorcycle;

public class MotorcycleFactory {
    public static Motorcycle createMotorcycle(String brand, String model, int year, Color color, String hp){
        return new Motorcycle(brand, model, year, color, hp);
    }
}
