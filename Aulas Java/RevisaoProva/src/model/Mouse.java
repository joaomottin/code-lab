package model;

public class Mouse extends Produto{
    private String tipo, descricao;

    public Mouse(String nome, double preco, String tipo, String descricao) {
        super(nome, preco);
        this.tipo = tipo;
        this.descricao = descricao;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String descrever() {
        return "O mouse de " + nome + " é da tipo " + tipo + " com seu preço médio de R$" + preco;
    }
    @Override
    public String toString() {
        return "Mouse{" +
                "nome='" + getNome() + '\'' +
                ", preco=" + getPreco() +
                ", tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    
}
