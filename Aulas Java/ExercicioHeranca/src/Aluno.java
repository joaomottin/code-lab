public final class Aluno extends Pessoa{
    private String curso;
    private int matricula;
    private float nota;

    public Aluno(String nome, String curso, String endereco, int idade, int matricula, float nota){
        super(nome, endereco, idade);
        this.curso=curso;
        this.matricula=matricula;
        this.nota=nota;
    }

public String situacao(float nota){
    if (nota <= 6) {
    return "Reprovado";
    }else{
        return "Aprovado";
    }
}

public String getCurso() {
    return curso;
}

public void setCurso(String curso) {
    this.curso = curso;
}

public int getMatricula() {
    return matricula;
}

public void setMatricula(int matricula) {
    this.matricula = matricula;
}

public float getNota() {
    return nota;
}

public void setNota(float nota) {
    this.nota = nota;
}

@Override
public String toString() {
    return "Aluno [nome=" + nome + ", endereco=" + endereco + ", curso=" + curso + ", idade=" + idade + ", matricula="
            + matricula + ", nota=" + nota + "]";
}



}
