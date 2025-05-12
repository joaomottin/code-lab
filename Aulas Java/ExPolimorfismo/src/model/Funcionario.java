package model;

public abstract class Funcionario {
    private String nome;
    private float salario;
    private int idade;

    public Funcionario(String nome, float salario, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public abstract float calcularComissao();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + salario + ", idade=" + idade + "]";
    }
    
}
