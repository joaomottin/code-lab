package model;

public enum CidadeEnum {
    CURITIBA("Curitiba"),
    CAMPO_LARGO("Campo Largo"),
    PONTA_GROSSA("Ponta Grossa");

    private String nome;

    private CidadeEnum(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    



}
