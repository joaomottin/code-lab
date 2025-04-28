/* Crie vários livros, ordene eles por nome e adicione na biblioteca, busque a lista da
biblioteca e crie uma lista de livros que deseja emprestar, chame o método emprestarLivros
da biblioteca, passe esta lista de livros e adicione o array de livros no Cliente, quando for
devolver zere a lista de livros do cliente e passe para a biblioteca pelo método devolverLivros */

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("1984", "George Orwell", "Distopia", 5));
        livros.add(new Livro("Dom Casmurro", "Machado de Assis", "Romance", 3));
        livros.add(new Livro("O Hobbit", "J.R.R. Tolkien", "Fantasia", 4));
        livros.add(new Livro("A Revolução dos Bichos", "George Orwell", "Satírico", 2));
        livros.add(new Livro("O Código Da Vinci", "Dan Brown", "Suspense", 6));
        
        Biblioteca biblioteca = new Biblioteca();
        for (Livro livro : livros) {
            biblioteca.adicionarLivro(livro);
        }

        

    }
}
