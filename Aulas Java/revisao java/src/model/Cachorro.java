package model;

public class Cachorro extends Animal  {
    private int idade;

    public Cachorro(String nome, String porte, int idade) {
        super(nome, porte);
        this.idade = idade;
    }

    @Override //sobreposição
    public String correr(){ 
        return "Cachorro correndo";
    }

    public String correr (int velocidade){ 
        return " correndo a " + velocidade + " km/h";
    }

    @Override
    public String emitirSom(){
        return null;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cachorro [idade=" + idade + "]";
    }

    
}
