package model;

public abstract class Produto {
    private String nome, marca;
    private float valor;

    public Produto(String nome, String marca, float valor) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }

    public abstract float calcularDesconto();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", marca=" + marca + ", valor=" + valor + "]";
    }
    
}
