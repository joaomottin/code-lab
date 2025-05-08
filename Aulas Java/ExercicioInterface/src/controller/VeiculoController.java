package controller;

import java.util.Collections;
import java.util.List;

import model.IVeiculo;

public class VeiculoController {
    private List<IVeiculo> veiculos;
    

    public VeiculoController(List<IVeiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void adicionarVeiculo(IVeiculo veiculo){
        veiculos.add(veiculo);
    }

    public void removerVeiculo(IVeiculo veiculo){
        veiculos.remove(veiculo);
    }

    public void ordenarVeiculo(){
        Collections.sort(veiculos);
    }
   
    public List<String> listarLigar(){
        return veiculos.stream()
                .map(a -> a.ligar())
                .toList();
    }

    public List<String> listarDesligar(){
        return veiculos.stream()
                .map(a -> a.desligar())
                .toList();
    }

    public List<String> listarAcelerar(){
        return veiculos.stream()
                .map(a -> a.acelerar())
                .toList();
    }

    public List<String> listarFrear(){
        return veiculos.stream()
                .map(a -> a.frear())
                .toList();
    }

    public List<String> listarVeiculos() {
        return veiculos.stream()
                .map(Object::toString)
                .toList();
    }
    
    @Override
    public String toString() {
        return "VeiculoController [veiculos=" + veiculos + "]";
    }    
}
