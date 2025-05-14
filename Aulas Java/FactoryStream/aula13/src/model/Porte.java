package model;

public enum Porte {
    PEQUENO("Pequeno"), MEDIO("Médio"), GRANDE("Grande");

    private String porte;

    private Porte(String porte){
        this.porte = porte;
    }
    
    public Porte buscaPorte(String porte){
        return Porte.valueOf(porte.trim().toUpperCase());
    }

    public String getPorteEmTexto(){
        return porte;
    }

    @Override
    public String toString(){
        return porte;
    }
}