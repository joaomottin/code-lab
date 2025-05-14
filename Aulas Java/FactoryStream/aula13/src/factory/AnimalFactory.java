package factory;

import java.util.List;
import java.util.Optional;

import model.Cachorro;
import model.Gato;
import model.Porte;

public class AnimalFactory {
    private static final List<String> PORTES_VALIDOS = List.of("Pequeno", "Médio", "Grande");

    public static Optional<Cachorro> criarCachorro(String nome, String porte, int idade){
        if(nome == null || nome.isBlank()) return Optional.empty();
        if(!PORTES_VALIDOS.contains(porte)) return Optional.empty();
        if(idade < 0) return Optional.empty();

        return Optional.of(new Cachorro(nome, porte, idade));
    }

    public static Optional<Cachorro> criarCachorro(String nome, Porte porte, int idade){
        if(nome == null || nome.isBlank()) return Optional.empty();
        if(idade < 0) return Optional.empty();

        return Optional.of(new Cachorro(nome, porte.getPorteEmTexto(), idade));
    }

    public static Optional<Gato> criarGato(String nome, Porte porte){
        if(nome == null || nome.isBlank()) return Optional.empty();

        return Optional.of(new Gato(nome, porte.getPorteEmTexto()));
    }
}
