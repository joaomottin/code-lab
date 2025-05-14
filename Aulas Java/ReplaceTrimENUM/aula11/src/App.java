import java.util.Scanner;

import model.Cidade;
import model.DiaDaSemana;
import view.PessoaView;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("View Principal");

        System.out.println(Cidade.CURITIBA);

        Cidade cidade = Cidade.CURITIBA;
        //cidade.setNome("Cuiabá");
        System.out.println(cidade);
        System.out.println(Cidade.CURITIBA);

        /*System.out.println("Digite o nome de uma Cidade");
        Cidade novaCidade = Cidade.valueOf(
            in.nextLine()
                .trim()
                .toUpperCase()
                .replace(" ", "_")
        );

        System.out.println("\nA cidade escolhida: " + novaCidade);
        */
        System.out.println("Digite outra Cidade");

        Cidade outraCidade = Cidade.getCidade(in.nextLine());
        System.out.println("\n outra Cidade " + outraCidade);

        PessoaView.main(args);

        System.out.println("\n ****** DIA DA SEMANA ******** \n");

        System.out.println("Dias úteis");

        for (DiaDaSemana dia : DiaDaSemana.values()) {
            if (dia.isUtil()) {
                System.out.println(dia);
            }
        }

        System.out.println("\n Dias não úteis");
        for (DiaDaSemana dia : DiaDaSemana.values()) {
            if (!dia.isUtil()) {
                System.out.println(dia);
            }
        }




    }
}
