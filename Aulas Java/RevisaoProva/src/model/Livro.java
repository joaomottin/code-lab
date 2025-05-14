package model;

public class Livro extends Produto{
    private String autor, genero;

    public Livro(String nome, double preco, String autor, String genero) {
        super(nome, preco);
        this.autor = autor;
        this.genero = genero;
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

    @Override
    public String descrever() {
        return "O livro \"" + getNome() + "\", do autor " + autor +
               ", pertence ao gênero " + genero + " e custa R$" + getPreco();
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + getNome() + '\'' +
                ", preco=" + getPreco() +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }  
}
