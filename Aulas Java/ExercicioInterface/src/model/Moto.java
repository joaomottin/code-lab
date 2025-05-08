package model;

public class Moto implements IVeiculo{
    private String modelo;
    private int ano, cilidrandas;

    public Moto(String modelo, int ano, int cilidrandas) {
        this.modelo = modelo;
        this.ano = ano;
        this.cilidrandas = cilidrandas;
    }

    @Override
    public String acelerar() {
        return "Moto " + modelo +" acelerando...";
    }
    @Override
    public String desligar() {
        return "Moto " + modelo +" desligando...";
    }
    @Override
    public String frear() {
        return "Moto " + modelo +" freiando...";
    }
    @Override
    public String ligar() {
        return "Moto " + modelo +" ligando...";
    }


    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getCilidrandas() {
        return cilidrandas;
    }
    public void setCilidrandas(int cilidrandas) {
        this.cilidrandas = cilidrandas;
    }
    @Override
    public String toString() {
        return "Moto [modelo=" + modelo + ", ano=" + ano + ", cilidrandas=" + cilidrandas + "]";
    }
    @Override
    public int compareTo(IVeiculo o) {
        return ligar().compareTo(o.ligar());
    }

}
