package view;

import java.util.ArrayList;

import controller.AnimalController;
import factory.AnimalFactory;
import model.Animal;
import model.Porte;

public class AnimalView {
    public static void main(String[] args) {
        AnimalController controller  = new AnimalController(new ArrayList<Animal>());

        AnimalFactory.criarCachorro("Pluto", "Grande", 10)
            .ifPresentOrElse(
                controller::adicionarAnimal,
                () -> System.out.println("Erro ao criar Animal")
            );

        AnimalFactory.criarGato("Felix", Porte.PEQUENO)
            .ifPresentOrElse(
                controller::adicionarAnimal,
                () -> System.out.println("Erro ao criar Animal")
            );

        System.out.println("Listar sons");
        controller.listarSons().forEach(System.out::println);

        
    }
}
