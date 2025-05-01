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

    public abstract String correr(); //Só pode ter metodo abstrato em classes abstratas

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

    
}
