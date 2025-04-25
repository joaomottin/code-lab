package model;

public class Pessoa {
    private String nome;
    private Cidade cidade;
    
    public Pessoa(String nome, Cidade cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(String nomeCidade) {
        this.cidade = Cidade.getCidade(nomeCidade);
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", cidade=" + cidade + "]";
    }
}
