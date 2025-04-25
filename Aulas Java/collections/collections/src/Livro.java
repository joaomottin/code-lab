public class Livro implements Comparable<Livro>{
    private String nome, autor, genero;
    private int qntd;

    public Livro(String nome, String autor, String genero, int qntd) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.qntd = qntd;
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
    public int getQntd() {
        return qntd;
    }
    public void setQntd(int qntd) {
        this.qntd = qntd;
    }
    
    
    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", autor=" + autor + ", genero=" + genero + ", qntd=" + qntd + "]";
    }
}
