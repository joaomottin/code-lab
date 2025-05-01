package model;

public class Gato extends Animal{
    public Gato(String nome, String porte){
        super(nome, porte);
    }

    @Override
    public String correr(){
        return "Gato correndo";
    }


}
