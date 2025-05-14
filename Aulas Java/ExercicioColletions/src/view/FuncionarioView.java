package view;

import controller.FuncionarioController;
import model.Desenvolvedor;
import model.Gerente;
import model.IFuncionario;

import java.util.Scanner;

public class FuncionarioView {
    private final FuncionarioController controller = new FuncionarioController();
    private final Scanner scanner = new Scanner(System.in);

    public void main() {
        int opcao;

        do {
            System.out.println("\n--- Menu Funcionários ---");
            System.out.println("1. Adicionar Gerente");
            System.out.println("2. Adicionar Desenvolvedor");
            System.out.println("3. Listar Funcionários");
            System.out.println("4. Remover Funcionário");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> adicionarGerente();
                case 2 -> adicionarDesenvolvedor();
                case 3 -> listarFuncionarios();
                case 4 -> removerFuncionario();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void adicionarGerente() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        System.out.print("Bônus: ");
        double bonus = scanner.nextDouble();

        controller.adicionar(new Gerente(nome, id, salario, bonus));
        //Retiraria o ID;
        System.out.println("Gerente adicionado com sucesso!");
    }

    private void adicionarDesenvolvedor() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Linguagem principal: ");
        String linguagem = scanner.nextLine();

        controller.adicionar(new Desenvolvedor(nome, id, salario, linguagem));
        //Retiraria o ID;
        System.out.println("Desenvolvedor adicionado com sucesso!");
    }

    private void listarFuncionarios() {
        if (controller.listar().isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (IFuncionario f : controller.listar()) {
                System.out.println(f);
            }
        }
    }

    private void removerFuncionario() {
        System.out.print("ID do funcionário a remover: ");
        int id = scanner.nextInt();

        if (controller.remover(id)) {
            System.out.println("Funcionário removido com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}
