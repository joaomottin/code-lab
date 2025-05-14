package view;

import model.Cidade;
import model.Pessoa;

public class PessoaView {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("view de Pessoa");

        Pessoa pessoa = new Pessoa("Pessoa", Cidade.getCidade("curitiba"));

        System.out.println(pessoa);

        pessoa.setCidade(scanner.nextLine());

        for (Cidade cidade : Cidade.values()) {
            System.out.println(cidade);
        }
    }
}
