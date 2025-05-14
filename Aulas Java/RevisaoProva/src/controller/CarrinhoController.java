package controller;

import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoController {
    private List<Produto> produtos;
    private double total;

    public CarrinhoController() {
        this.produtos = new ArrayList<>();
        this.total = 0.0;
    }

    private void calcularVenda() {
        total = 0.0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
    }

    public void vender(List<Produto> lista) {
        produtos.addAll(lista);
        calcularVenda();
        System.out.println("Produtos adicionados ao carrinho: ");
        for (Produto p : lista) {
            System.out.println("- " + p.getNome());
        }
    }

    public void vender(Produto produto) {
        produtos.add(produto);
        total += produto.getPreco();
        System.out.println("Produto adicionado ao carrinho: " + produto.getNome());
    }

    @Override
    public String toString() {
        String result = "Carrinho de Compras:\n";
        for (Produto p : produtos) {
            result += "- " + p.descrever() + "\n";
        }
        result += "Total: R$" + String.format("%.2f", total);
        return result;
    }

    public double getTotal() {
        return total;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
