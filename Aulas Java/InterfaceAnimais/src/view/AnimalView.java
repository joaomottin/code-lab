package view;

import java.util.ArrayList;

import controller.AnimalController;
import model.Cachorro;
import model.Gato;
import model.IAnimal;

public abstract class AnimalView {
    public static void main(){ 
        AnimalController controller = new AnimalController(new ArrayList<IAnimal>());

        Gato gato1 = new Gato("Garfield", "Lasanha", 20);
        Gato gato2 = new Gato("Felix", "miau", 10);
        Cachorro dog1 = new Cachorro("Pluto", "auau", 5);
        Cachorro dog2 = new Cachorro("Laica", "vazio intenso", 3);

        controller.adicionarAnimal(dog1);
        controller.adicionarAnimal(dog2);
        controller.adicionarAnimal(gato1);
        controller.adicionarAnimal(gato2);
 
        //controller.getAnimais().remove(dog1);
        //controller.getAnimais().remove(dog2);

        controller.ordenarAnimais();
        controller.listarSom().forEach(System.out::println); //A cada laço, vai chamar o listarSom()
    }
}
