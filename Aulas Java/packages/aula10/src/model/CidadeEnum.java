package model;

public enum CidadeEnum {
    CURITIBA("Curitiba Enum"),
    CAMPO_LARGO("Campo Largo Enum"),
    PONTA_GROSSA("Ponta Grossa Enum");

    private String nome;

    private CidadeEnum(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    

}
