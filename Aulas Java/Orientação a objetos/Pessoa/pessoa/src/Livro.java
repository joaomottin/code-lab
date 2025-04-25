public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String informacoes(){
        return "O livro "+titulo+" do autor "+autor+" foi publicado em "+anoPublicacao;
    }

}
