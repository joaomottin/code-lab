package view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.UsuarioController;
import model.Status;
import model.Usuario;

public abstract class UsuarioView {
    public static void exibir(){
        List<Usuario> lista = new ArrayList<>();
        try {
            lista = UsuarioController.carregar();    
        } catch (IOException e) {
            System.err.println("Arquivo não encontrado " + e.getMessage());
        }catch (ClassNotFoundException e){
            System.err.println("Arquivo corrompido");
        }
        
        UsuarioController controller = new UsuarioController(lista);

        try(Scanner in = new Scanner(System.in)){
            boolean menu = true;

            do{

                System.out.println("****** MENU *******");
                System.out.println("1 - Cadastrar Usuário");
                System.out.println("2 - Listar Usuários");
                System.out.println("3 - Adicionar Tarefa ao Usuário");
                System.out.println("4 - Listar Tarefas de um Usuário");
                System.out.println("0 - Sair");

                int opcao = in.nextInt();
                in.nextLine();
    switch (opcao) {
        case 1:
            System.out.println("Digite o nome do Usuário");
            controller.criaUsuario(in.nextLine());                
        break;
        case 2:
            controller.listarUsuarios().forEach(System.out::println);
        break;
        case 3:
            controller.listarUsuarios().forEach(System.out::println);

            System.out.println("Digite o Id do usuário");
            int idUsuario = in.nextInt();
            in.nextLine();
            System.out.println("Digite a descrição da tarefa");
            String descricao = in.nextLine();
            System.out.println("Status (1 - Pendente, 2 - Em Andamento,  3 - Concluída)");
            int idStatus = in.nextInt();
            controller.adicionarTarefa(idUsuario, descricao, Status.obterStatusPorId(idStatus));
        break;
        case 4:
            controller.listarUsuarios().forEach(System.out::println);
            System.out.println("Digite o id do usuário");
            int id = in.nextInt();
            controller.buscarUsuarioPorId(id).ifPresentOrElse(
            u -> u.getTarefas().forEach(System.out::println), 
            () -> System.out.println("Usuário não encontrado"));

        break;
        case 0:
            try{
                controller.salvar();
                System.out.println("Dados salvos com sucesso!");
                System.out.println("Encerrando o sistema");
                menu = false;
                
            }catch(IOException e){
                System.out.println("Erro ao salvar Arquivo");
                System.err.println(e.getMessage());
            }
        break;
        default:
            System.out.println("Digite uma opção válida");
        break;
    }

                
            }while(menu);
            
        } catch (Exception e) {
            System.err.println("Erro ao iniciar o Scanner");
        }
    }
}
