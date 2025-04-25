import java.util.Scanner;

import model.Cidade;
import model.DiaDaSemana;
import view.PessoaView;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Cidades\n");

        System.out.println(Cidade.CURITIBA);

        Cidade cidade = Cidade.CURITIBA;
        cidade.setNome("Cuiabá");
        System.out.println(cidade);
        System.out.println(Cidade.CURITIBA);

        System.out.println("Digite o nome de uma Cidade");
        Cidade novaCidade = Cidade.valueOf(in.nextLine().trim().toUpperCase().replace(" ", "_"));
        System.out.println(novaCidade);
        PessoaView.main(args);

        System.out.println("\n***********DIAS DA SEMANA****************");
        System.out.println("Dias úteis");

        for (DiaDaSemana dia : DiaDaSemana.values()){
            if (dia.isUtil()){
                System.out.println(dia);
            }
        }

        for (DiaDaSemana dia : DiaDaSemana.values()){
            if (!dia.isUtil()){
                System.out.println(dia);
            }
        }



    }
}
