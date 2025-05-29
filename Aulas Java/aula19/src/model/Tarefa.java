package model;

import java.io.Serializable;

public class Tarefa implements Serializable{
    private int id;
    private String descricao;
    private Status status;
    
    private Tarefa(String descricao, Status status) {
        this.descricao = descricao;
        this.status = status;
    }

    public static Tarefa criar(String descricao, Status status){
        return new Tarefa(descricao, status);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa #" + id + " " + descricao + " " + status;
    }

    
}
