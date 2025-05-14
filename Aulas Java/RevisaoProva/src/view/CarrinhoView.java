package view;

import controller.CarrinhoController;
import model.Livro;
import model.Mouse;
import model.Produto;

import java.util.ArrayList;
import java.util.List;

public abstract class CarrinhoView {
    public static void main() {
        // Criando produtos
        Livro livro1 = new Livro("Java para Iniciantes", 59.90, "John Doe", "Tecnologia");
        Livro livro2 = new Livro("Spring Framework", 89.90, "Jane Doe", "Tecnologia");

        Mouse mouse1 = new Mouse("Mouse Logitech", 129.90, "Ergonômico", "Mouse confortável para longas horas");

        // Criando o controlador de carrinho
        CarrinhoController carrinhoController = new CarrinhoController();

        // Adicionando produtos individualmente
        carrinhoController.vender(livro1);
        carrinhoController.vender(mouse1);

        // Adicionando uma lista de produtos
        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(livro2);
        carrinhoController.vender(listaProdutos);

        // Exibindo os produtos e o total
        System.out.println(carrinhoController.toString());
    }
}

