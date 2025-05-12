package controller;

import java.util.Collections;
import java.util.List;

import model.Venda;

public class VendaController {
    private List<Venda> vendas;

    public VendaController(List<Venda> vendas){
        this.vendas = vendas;
    }

    public void adicionarVenda(Venda venda){
        vendas.add(venda);
    }

    public List<String> listarVendas(){
        return vendas.stream()
        .map(a -> a.)
    }        
}
