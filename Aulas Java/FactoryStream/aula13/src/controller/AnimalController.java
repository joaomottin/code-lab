package controller;

import java.util.List;

import model.Animal;
import model.Cachorro;
import model.Gato;

public class AnimalController {
    private List<Animal> animais;

    public AnimalController(List<Animal> animais) {
        this.animais = animais;
    }

    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }

    public List<String> listarSons(){
        return animais.parallelStream()
            .map(a -> {
                 return a.getNome() + " diz: " + a.emitirSom();
            })
            .toList();
    }

    public List<String> correrAnimais(){
        return animais.stream()
            .map(a -> a.getNome() + " diz: " + a.correr())
            .toList();
    }

    public List<String> correrCachorrosComVelocidade(){
        return animais.stream()
            .filter(a -> a instanceof Cachorro)
            .map(a -> {
                Cachorro c = (Cachorro) a;
                return c.getNome() + " está " + c.correr(100);
            })
            .toList();
    }

    public List<Cachorro> listaCachorros(){
        return animais.stream()
            .filter(a -> a instanceof Cachorro)
            .map(c -> (Cachorro) c)
            .toList();
    }

    public List<Gato> listaGatos(){
        return animais.stream()
            .filter(a -> a instanceof Gato)
            .map(g -> (Gato) g)
            .toList();
    }  
}
