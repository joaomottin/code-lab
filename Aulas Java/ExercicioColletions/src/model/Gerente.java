package model;

public final class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, int id, double salario, double bonus) {
        //Retiraria o ID;
        super(nome, id, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Gerente [bonus=" + bonus + "]";
    }
    
}
