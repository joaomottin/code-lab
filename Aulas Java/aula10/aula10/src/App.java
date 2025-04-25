import view.*;
import controller.*;
import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! MAIN");
        View.main(args);
        Model.main(args);
        Controller.main(args);

        System.out.println(CidadeEnum.CAMPO_LARGO);

        CidadeEnum cidade = CidadeEnum.CAMPO_LARGO;

        System.out.println(cidade.getNome());

        System.out.println("Digite uma cidade: ");
        CidadeEnum = CidadeEnum.valueOf()
    }
}
