package model;

public final class Notebook extends Produto{
    private String processador, memoria;

    public Notebook(String nome, String marca, float valor, String processador, String memoria) {
        super(nome, marca, valor);
        this.processador = processador;
        this.memoria = memoria;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public float calcularDesconto() {
        return 0;
    }

}
