package model;

public enum Status {
    PEDENTE(1, "Pendente"),
    EM_ANDAMENTO(2, "Em andamento"),
    CONCLUIDA(3, "Concluída");

    private int id;
    private String nome;

    private Status(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public static Status obterStatusPorId(int id){
        for (Status status : Status.values()) {
            if (status.getId() == id) {
                return status;
            }
        }
        throw new IllegalArgumentException("ID inválido");
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
