package model;

public abstract class Animal {
    private String nome, porte;

    public Animal(String nome, String porte) {
        this.nome = nome;
        this.porte = porte;
    }

    public String emitirSom(){
        return "Som genérico";
    }

    public abstract String correr();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", porte=" + porte + "]";
    }

}
