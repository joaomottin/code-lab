import java.util.List;

public class Aluno {
    private String nome;
    private List<Materia> materias;

    public Aluno(String nome, List<Materia> materias) {
        this.nome = nome;
        this.materias = materias;
    }

    public void addMateria(Materia materia){
        materias.add(materia);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Materia> getMaterias() {
        return materias;
    }
    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", materias=" + materias + "]\n";
    } 
}
