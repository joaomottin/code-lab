package model;

public final class Gerente extends Funcionario{
    private float comissao;

    public Gerente(String nome, float salario, int idade, float comissao) {
        super(nome, salario, idade);
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public float calcularComissao() {
        return 0;
    }

    @Override
    public String toString() {
        return "Gerente [comissao=" + comissao + "]";
    }
}
