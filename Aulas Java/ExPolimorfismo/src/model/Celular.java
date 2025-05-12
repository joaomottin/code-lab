package model;

public final class Celular extends Produto{
    private String modelo, numero;

    public Celular(String nome, String marca, float valor, String modelo, String numero) {
        super(nome, marca, valor);
        this.modelo = modelo;
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public float calcularDesconto() {
        return 0;
    }
}
