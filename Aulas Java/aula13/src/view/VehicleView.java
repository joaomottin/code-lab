package view;

import java.util.ArrayList;

import controller.VehicleController;
import factory.CarFactory;
import model.Motorcycle;
import model.Car;
import model.Vehicle;
import model.Color;

public class VehicleView {
    public static void main(String[] args){
        VehicleController controller = new VehicleController(new ArrayList<Vehicle>());

        Motorcycle motorcycle1 = new Motorcycle("Suzuki", "Srad", 2005, Color.WHITE, "750hp");
        Motorcycle motorcycle2 = new Motorcycle("Honda", "PCX", 2005, Color.BLUE, "150hp");
        Motorcycle motorcycle3 = new Motorcycle("Kawasaki", "Vulcan S", 2016, Color.RED, "650hp");

        Car car1 = CarFactory.createCar("BYD", "Seal", 2025, Color.WHITE, "Elétrico");
        Car car2 = CarFactory.createCar("Ferrari", "Enzo", 2015, Color.RED, "4.0 V6");
        Car car3 = CarFactory.createCar("Porsche", "GT3 RS", 2025, Color.BLUE, "4.0 Boxter");


        controller.addVehicle(car3);
        controller.addVehicle(car2);
        controller.addVehicle(car1);

        controller.addVehicle(motorcycle1);
        controller.addVehicle(motorcycle2);
        controller.addVehicle(motorcycle3);

        System.out.println("Listing Cars");
        controller.listCars().forEach(System.out::println);
        System.out.println("Listing Motorcycles");
        controller.listMotorcycles().forEach(System.out::println);


    }
}
