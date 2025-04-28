/*Crie uma classe chamada Livro, essa classe deve possuir os seguintes atributos privados:
nome, atuor, gênero, quantidade disponível e os seguintes métodos.
• Construtor;
• Getter e Setters;
• toString e compareTo;
• verEstoque() – Deve verificar a quantidade de livros disponíveis. */

public class Livro implements Comparable<Livro>{
    private String nome, autor, genero;
    private int quantidade;

    public Livro(String nome, String autor, String genero, int quantidade) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.quantidade = quantidade;
    }

    public void verEstoque(){
        System.out.println("Estoque disponível");
        System.out.println();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", autor=" + autor + ", genero=" + genero + ", quantidade=" + quantidade + "]";

    }

    @Override
    public int compareTo(Livro l) {
        return nome.compareTo(l.getNome());
    }
}
