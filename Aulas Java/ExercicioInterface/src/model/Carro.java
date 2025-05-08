package model;

public class Carro implements IVeiculo{
    private String modelo;
    private int ano, numPortas;

    public Carro(String modelo, int numPortas, int ano) {
        this.modelo = modelo;
        this.numPortas = numPortas;
        this.ano = ano;
    }

    @Override
    public String acelerar() {
        return "Carro " + modelo +" acelerando...";
    }
    @Override
    public String desligar() {
        return "Carro " + modelo +" desligando...";
    }
    @Override
    public String frear() {
        return "Carro " + modelo +" freiando...";
    }
    @Override
    public String ligar() {
        return "Carro " + modelo +" ligando...";
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getNumPortas() {
        return numPortas;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", numPortas=" + numPortas + ", ano=" + ano + "]";
    }
    @Override
    public int compareTo(IVeiculo o) {
        return ligar().compareTo(o.ligar());
    }
}
