package model;

public enum Cidade {
    CURITIBA(41, "Curitiba"),
    PONTA_GROSSA(42, "Ponta Grossa"),
    SAO_JOSE_DOS_PINHAIS(41, "São José dos Pinhais");

    private int ddd;
    private String nome;
    
    private Cidade(int ddd, String nome) {
        this.ddd = ddd;
        this.nome = nome;
    }

    public static Cidade getCidade(String nome){
        return Cidade.valueOf(
            nome
                .trim()
                .replace(" ", "_")
                .toUpperCase()
            );
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "(" + ddd + ") - " + nome;
    }
}
