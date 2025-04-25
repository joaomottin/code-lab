package model;

public enum DiaDaSemana {
    SEGUNDA(true, "Segunda-Feira"),
    TERCA(true, "Terça-Feira"),
    QUARTA(true, "Quarta-Feira"),
    QUINTA(true, "Quinta-Feira"),
    SEXTA(true, "Sexta-Feira"),
    SABADO(false, "Sabado"),
    DOMINGO(false, "Domingo"),

    private boolean util;
    private String dia;

    private DiaDaSemana(boolean util, String dia) {
        this.util = util;
        this.dia = dia;
        
    }

    public static DiaDaSemana.getDiaDaSemana(String dia){
        return DiaDaSemana.valueOf(
            dia.trim()
                .toUpperCase()
                .replace("-FEIRA", "")
                .replace("FEIRA", "")

        );
    }

    public boolean isUtil() {
        return util;
    }

    public String getDia() {
        return dia;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}
