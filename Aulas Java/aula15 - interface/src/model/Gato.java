package model;

public class Gato implements IAnimal, Testavel{
    private String nome, som;
    private int idade;

    public Gato(String nome, String som, int idade) {
        this.nome = nome;
        this.som = som;
        this.idade = idade;
    }

    @Override
    public String teste(){
        return "Testando...";
    }

    @Override
    public int compareTo(IAnimal o){
        return this.nome.compareTo(o.emitirSom());
    }

    @Override
    public String andar() {
        return nome + " andando ";
    }

    @Override
    public String emitirSom() {
        return nome + " emitindo som " + som;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSom() {
        return som;
    }
    public void setSom(String som) {
        this.som = som;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", som=" + som + ", idade=" + idade + "]";
    }
}
