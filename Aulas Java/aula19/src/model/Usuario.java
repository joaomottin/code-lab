package model;

import java.io.Serializable;
import java.util.List;

public class Usuario implements Serializable{
    private static final long serialVersionUID = 456789L;
    private int id;
    private String nome;
    private List<Tarefa> tarefas;
    
    private Usuario(int id, String nome, List<Tarefa> tarefas) {
        this.id = id;
        this.nome = nome;
        this.tarefas = tarefas;
    }

    public static Usuario criar(int id, String nome, List<Tarefa> tarefas){
        //Validações
        return new Usuario(id, nome, tarefas);
    }

    private int gerarIdTarefa(){
        return tarefas.stream()
                .mapToInt(Tarefa::getId)
                .max()
                .orElse(0) + 1;
    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefa.setId(gerarIdTarefa());
        this.tarefas.add(tarefa);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getTarefas() {
        return tarefas.stream()
                .map(t -> t.toString())
                .toList();
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    @Override
    public String toString() {
        return "Usuario #" + id + " " + nome;
    }
    
    
}
