package model;

public abstract class Funcionario implements IFuncionario{ 
    //private static int proximoId = 1;
    
    protected String nome;
    protected int id;
    protected double salario;
    
    public Funcionario(String nome, int id, double salario) {
        this.nome = nome;
        this.id = id;
        //removeria esse id de cima e colocaria this.id = proximoId++;
        this.salario = salario;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", id=" + id + ", salario=" + salario + "]";
    }
}
