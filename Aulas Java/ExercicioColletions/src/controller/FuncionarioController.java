package controller;

import model.IFuncionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    private List<IFuncionario> funcionarios = new ArrayList<>();

    public void adicionar(IFuncionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<IFuncionario> listar() {
        return funcionarios;
    }

    public boolean remover(int id) {
        return funcionarios.removeIf(f -> f.getId() == id);
    }
}
