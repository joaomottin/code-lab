package model;

import java.util.List;

public class Venda {
    private List<Produto> produtos;
    private Vendedor vendedor;

    public Venda(List<Produto> produtos, Vendedor vendedor) {
        this.produtos = produtos;
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getValor() - p.calcularDesconto();
        }
        return total;
    }

    public void atualizarVendedor() {
        double valorTotal = calcularValorTotal();
        vendedor.setNumeroDeVendas(vendedor.getNumeroDeVendas() + valorTotal);
        vendedor.setNumeroDeVendas(vendedor.getNumeroDeVendas() + 1);
    }
}
