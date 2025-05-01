package view;

import java.util.ArrayList;

import controller.AnimalController;
import factory.AnimalFacory;
import model.Animal;
import model.Porte;

public class AnimalView {
    public static void main(String[] args){
        AnimalController controller = new AnimalController(new ArrayList<Animal>());

        AnimalFacory.criarCachorro("Bolt", "Médio", 7)
            .ifPresentOrElse(
                controller::adicionarAnimal, //Deu boa
                () ->System.out.println("Erro ao criar Animal") //Deu ruim
                );

        AnimalFacory.criarGato("Félix", Porte.PEQUENO)
        .ifPresentOrElse(
            controller::adicionarAnimal, //Deu boa
            () -> System.out.println("Erro ao criar Animal") //Deu ruim
        );

    System.out.println("Listar sons");
    controller.listarSons().forEach(System.out::println);    
    }
}
