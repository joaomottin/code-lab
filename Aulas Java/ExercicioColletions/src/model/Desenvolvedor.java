package model;

public final class Desenvolvedor extends Funcionario{
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, int id, double salario, String linguagemPrincipal) {
        //Retiraria o ID;
        super(nome, id, salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    @Override
    public String toString() {
        return "Desenvolvedor [linguagemPrincipal=" + linguagemPrincipal + "]";
    }
    
}
