package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import dal.UsuarioDAO;
import model.Tarefa;
import model.Usuario;
import model.Status;

public class UsuarioController {
    List<Usuario> usuarios;

    public UsuarioController(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void criaUsuario(String nome){
        usuarios.add(
            Usuario.criar(gerarIdUsuario(), nome, new ArrayList<Tarefa>())
        );
    }

    public int gerarIdUsuario(){
        return usuarios.stream()
                .mapToInt(Usuario::getId)
                .max()
                .orElse(0) + 1;
    }

    public List<String> listarUsuarios(){
        return usuarios.stream()
                .map(Usuario::toString)
                .toList();
    }

    public Optional<Usuario> buscarUsuarioPorId(int id){
        return usuarios.stream()
                .filter(u -> u.getId() == id)
                .findFirst();
    }

    public void adicionarTarefa(int idUsuario, String descicao, Status status) throws Exception{
        buscarUsuarioPorId(idUsuario).ifPresentOrElse(
            u -> u.adicionarTarefa(Tarefa.criar(descicao, status)),
            () -> new Exception("Usuário não encontrado")
        );
    }

    public void salvar() throws IOException{
        UsuarioDAO.salvar(usuarios);
    }

    public static List<Usuario> carregar() throws IOException, ClassNotFoundException{
        return UsuarioDAO.carregar();
    }
    
}
