import view.*;
import model.*;

import java.util.Scanner;

import controller.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, World! - MAIN");
        View.main(args);
        Model.main(args);
        Controller.main(args);

        System.out.println(CidadeEnum.CAMPO_LARGO);

        CidadeEnum cidade = CidadeEnum.CAMPO_LARGO;

        System.out.println(cidade.getNome());

        System.out.println("Digite uma cidade:");
        CidadeEnum  novaCidade = CidadeEnum.valueOf(
            scanner.nextLine().trim().toUpperCase().replace(" ", "_")
        );

        System.out.println(novaCidade);
    }
}
