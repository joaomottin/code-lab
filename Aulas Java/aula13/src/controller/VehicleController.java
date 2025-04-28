package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import model.Car;
import model.Motorcycle;
import model.Vehicle;

public class VehicleController {
    private List<Vehicle> vehicles; //correct java nomenclature for List

    public VehicleController(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public Optional<Vehicle> findVehicle(String model){
        return vehicles.stream() //stream is just a forEach
        .filter(v -> v.getModel().equals(model))
        .findFirst();
    }

    public boolean changeVehicle (String model, Vehicle newVehicle){
        Optional<Vehicle> vehicleOpt = findVehicle(model);
        if(vehicleOpt.isPresent()){
            Vehicle vehicle = vehicleOpt.get();
            vehicles.remove(vehicle);
            vehicles.add(vehicle);
            return true;
        }
        return false;
    }

    public void sortByYear(){
        vehicles = vehicles.stream()
        .sorted(Comparator.comparingInt(Vehicle::getYear)
        .reversed())
        .toList();
        //Collections.sort(vehicles, Comparator.comparingInt(Vehicle::getYear));
    }

    public boolean remove(String model){
        Optional<Vehicle> vehicleOpt = findVehicle(model);
        return vehicleOpt.map(vehicles::remove).orElse(false);
    }

    public List<Vehicle> listVehicles(){
        return vehicles;
    }

    public List<Motorcycle> listMotorcycles(){
        return vehicles.stream()
        .filter(v -> v instanceof Motorcycle)
        .map(m -> (Motorcycle) m)
        .toList(); 
    }


    public List<Car> listCars(){
        return vehicles.stream()
        .filter(v -> v instanceof Car)
        .map(m -> (Car) m)
        .toList(); 
    }
}
