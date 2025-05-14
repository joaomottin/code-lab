public final class Cachorro extends Animal{
    private String teste;

    public Cachorro(String nome, String som, String teste) {
        super(nome, som);
        this.teste = teste;
    }

    public String abanarRabo(){
        return "Cachorro abanando rabo";
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    @Override
    public String toString() {
        return "Cachorro [nome=" + nome + ", som=" + som + ", teste=" + teste + ", dormindo=" + dormindo + ", fome="
                + fome + "]";
    }



    
}
