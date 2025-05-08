package view;

import java.util.ArrayList;

import controller.VeiculoController;
import model.Barco;
import model.Carro;
import model.IVeiculo;
import model.Moto;

public abstract class VeiculoView {
    public static void main(){
        VeiculoController controller = new VeiculoController(new ArrayList<IVeiculo>());

        Carro carro1 = new Carro("BMW 320i", 4, 2024);
        Carro carro2 = new Carro("BYD Seal", 4, 2023);

        Moto moto1 = new Moto("R15", 2025, 155);
        Moto moto2 = new Moto("S1000RR", 2025, 100);

        Barco barco1 = new Barco("Titanic","Preto", "Afundado");
        Barco barco2 = new Barco("Barco do Bill Gates","Branco", "Bizonho");

        controller.adicionarVeiculo(carro1);
        controller.adicionarVeiculo(carro2);
        controller.adicionarVeiculo(moto1);
        controller.adicionarVeiculo(moto2);
        controller.adicionarVeiculo(barco1);
        controller.adicionarVeiculo(barco2);

        controller.listarAcelerar().forEach(System.out::println);
        controller.listarDesligar().forEach(System.out::println);
        controller.listarFrear().forEach(System.out::println);
        controller.listarLigar().forEach(System.out::println);

        controller.ordenarVeiculo();
        System.out.println("-------");

        controller.listarAcelerar().forEach(System.out::println);
        controller.listarDesligar().forEach(System.out::println);
        controller.listarFrear().forEach(System.out::println);
        controller.listarLigar().forEach(System.out::println);
    }
}
