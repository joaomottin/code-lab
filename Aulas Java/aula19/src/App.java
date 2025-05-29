import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import util.Log;
import view.UsuarioView;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Aula 19 - Manipulação de Arquivos");
        Log.setError();
        //UsuarioView.exibir();

        List<String> lista = new ArrayList<>();

        lista.addAll(Arrays.asList("Academia", "Animais", "Caixa Eletronico", "Concessionária", "Controle Estoque",
                "Escola", "Estacionamento", "Get Ninja", "Locadora", "Locadora Veiculo", "Mecanica"));

        List<String> listaDia13 = new ArrayList<>();
        List<String> listaDia18 = new ArrayList<>();

        Collections.shuffle(lista);

        for (int i = 0; i < lista.size(); i++) {
            if (i % 2 == 0) {
                listaDia13.add(lista.get(i));
            } else {
                listaDia18.add(lista.get(i));
            }
        }

        System.out.println("Lista para o dia 13:");
        listaDia13.forEach(System.out::println);

        System.out.println("\nLista para o dia 18:");
        listaDia18.forEach(System.out::println);
    }
}
