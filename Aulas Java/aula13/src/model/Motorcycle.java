package model;

public class Motorcycle extends Vehicle{
    private String hp;

    public Motorcycle(String brand, String model, int year, Color color, String hp) {
        super(brand, model, year, color);
        this.hp = hp;
    }

    public String wheelie(){
        return "Motorcycle " + brand + " " + model + " is wheeling";
    }
    
    @Override
    public String move() {
        return "Motorcycle moving";
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Motorcy [hp=" + hp + "]";
    }
    
}
