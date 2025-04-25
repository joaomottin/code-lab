import java.util.List;

public class Cliente {
    private String nome;
    private List<Livro> livros;

    public Cliente(String nome, List<Livro> livros) {
        this.nome = nome;
        this.livros = livros;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Livro> getLivros() {
        return livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", livros=" + livros + "]";
    }

    
}
