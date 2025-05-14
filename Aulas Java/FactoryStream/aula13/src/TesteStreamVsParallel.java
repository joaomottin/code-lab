import model.Animal;
import model.Cachorro;
import model.Gato;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStreamVsParallel {

    public static void main(String[] args) {
        System.out.println("Este é apenas um exemplo, não segue as boas práticas de programação");
        List<Animal> animais = gerarAnimais(10_000_000);

        long inicioStream = System.currentTimeMillis();

        List<String> sonsStream = animais.stream()
            .map(animal -> {
                long resultado = 0;
                for (int i = 0; i < 1_000; i++) {
                    resultado += i * i;
                }
                return animal.emitirSom();
            })
            .toList();

        long fimStream = System.currentTimeMillis();
        System.out.println("Tempo com Stream: " + (fimStream - inicioStream) + " ms");

        long inicioParallel = System.currentTimeMillis();

        List<String> sonsParallel = animais.parallelStream()
            .map(animal -> {
                long resultado = 0;
                for (int i = 0; i < 1_000; i++) {
                    resultado += i * i;
                }
                return animal.emitirSom();
            })
            .toList();

        long fimParallel = System.currentTimeMillis();
        System.out.println("Tempo com ParallelStream: " + (fimParallel - inicioParallel) + " ms");
    }

    public static List<Animal> gerarAnimais(int quantidade) {
        List<Animal> lista = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            if (i % 2 == 0) {
                lista.add(new Cachorro("Dog" + i, "Médio", i % 10));
            } else {
                lista.add(new Gato("Gato" + i, "Pequeno"));
            }
        }
        return lista;
    }
}
