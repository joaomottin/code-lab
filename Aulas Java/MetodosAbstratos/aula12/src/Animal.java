public abstract class Animal {
    protected String nome, som;
    protected boolean dormindo, fome;

    public Animal(String nome, String som) {
        this.nome = nome;
        this.som = som;
        this.dormindo = false;
        this.fome = true;
    }

    public String emitirSom(){
        return "Animal emitindo som " + som;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public boolean isDormindo() {
        return dormindo;
    }

    public void setDormindo(boolean dormindo) {
        this.dormindo = dormindo;
    }

    public boolean isFome() {
        return fome;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", som=" + som + ", dormindo=" + dormindo + ", fome=" + fome + "]";
    }    
}