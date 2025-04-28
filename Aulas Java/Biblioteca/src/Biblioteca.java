/*Crie uma classe chamada Biblioteca, essa classe deve possuir os seguintes atributos privados:
nome, Lista de Livros disponíveis e os seguintes métodos
• Construtor
• Getters e Setters;
• toString;
• emprestarLivros (Lista de Livros) – deve receber uma lista de livros, verificar se tem
estoque disponível e retornar a lista de Livros apenas com os livros que tem estoque
disponível
• devolverLivros (Lista de Livros) – deve receber uma lista de livros, e adicionar no
estoque a quantidade de livros  */

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome, listaLivrosDisponiveis;

    public Biblioteca(String nome, String listaLivrosDisponiveis) {
        this.nome = nome;
        this.listaLivrosDisponiveis = listaLivrosDisponiveis;
    }

    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void emprestarLivros(){
        
    }

    public void devolverLivros(){


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getListaLivrosDisponiveis() {
        return listaLivrosDisponiveis;
    }

    public void setListaLivrosDisponiveis(String listaLivrosDisponiveis) {
        this.listaLivrosDisponiveis = listaLivrosDisponiveis;
    }

    @Override
    public String toString() {
        return "Biblioteca [nome=" + nome + ", listaLivrosDisponiveis=" + listaLivrosDisponiveis + "]";
    }

    
}
