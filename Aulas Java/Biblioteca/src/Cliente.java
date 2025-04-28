/*Crie uma classe chamada Cliente, essa classe deve possuir os seguintes atributos privados:
nome, Lista de Livros emprestados e os seguintes métodos.
• Contrutor - O construtor não deve receber uma lista de livros;
• Getters e Setters;
• toString */

public class Cliente {
    private String nome, listaLivrosEmprestados;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getListaLivrosEmprestados() {
        return listaLivrosEmprestados;
    }

    public void setListaLivrosEmprestados(String listaLivrosEmprestados) {
        this.listaLivrosEmprestados = listaLivrosEmprestados;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", listaLivrosEmprestados=" + listaLivrosEmprestados + "]";
    }
}
