package controller;

import java.util.Collections;
import java.util.List;

import model.IAnimal;

public class AnimalController {
    private List<IAnimal> animais;   

    public AnimalController(List<IAnimal> animais) {
        this.animais = animais;
    }

    public void adicionarAnimal(IAnimal animal){
        animais.add(animal);
    }

    public void removerAnimal(IAnimal animal){
        animais.remove(animal);
    }

    //public void ordenarAnimais(){
    //    Collections.sort(animais);
    //}
//
    //private List<String> listarSom(){
    //    return animais.stream().map(a->a.emitirsom()).toList();
    //}


    public List<IAnimal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<IAnimal> animais) {
        this.animais = animais;
    }

    public void ordenarAnimais(){
        Collections.sort(animais);
    }

    public List<String> listarSom(){
        return animais.stream().map(a->a.emitirSom()).toList();
    }

    @Override
    public String toString() {
        return "AnimalController [animais=" + animais + "]";
    }
}
