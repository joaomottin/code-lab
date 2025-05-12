package model;

public final class Vendedor extends Funcionario{
    private float comissao;
    double numeroDeVendas;
    private int totalDeVendas;

    public Vendedor(String nome, float salario, int idade, float comissao, int numeroDeVendas, int totalDeVendas) {
        super(nome, salario, idade);
        this.comissao = comissao;
        this.numeroDeVendas = numeroDeVendas;
        this.totalDeVendas = totalDeVendas;
    }
    
    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    public double getNumeroDeVendas() {
        return numeroDeVendas;
    }
    public void setNumeroDeVendas(double numeroDeVendas) {
        this.numeroDeVendas = numeroDeVendas;
    }
    public int getTotalDeVendas() {
        return totalDeVendas;
    }
    public void setTotalDeVendas(int totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }

    @Override
    public float calcularComissao() {
        return 0;
    }
    
}
