public class App {
    public static void main (String[] args) throws Exception {
        System.out.println("Lista de exercicios 3");

        System.out.println("\nExercicio 1  - Pessoa\n");
        Pessoa pessoa = new Pessoa ("Joao", 18);
        System.out.println(pessoa.apresentar());

        System.out.println("\nExercicio 2  - Livro\n");
        Livro livro = new Livro ("Dom Quixote", "Romero brito", 2019);
        System.out.println(livro.informacoes());
        
        System.out.println("\nExercicio 3  - Conta\n");
        Conta conta = new Conta(129382974, "joao", 501);

        conta.sacar(500);
        System.out.println(conta.imprimir());
        conta.depositar(1000);
        conta.sacar(500);
        System.out.println(conta.imprimir());

        System.out.println("\nExercicio 4  - Cafeteira\n");
        Cafeteira cafe = new Cafeteira();

        System.out.println((cafe.fazerCafe())? "Café quentinho": "Acabou o café");
        System.out.println(cafe.status());

        cafe.ligar();
        cafe.encherCafe(10);
        cafe.encherAgua(40);

        System.out.println((cafe.fazerCafe())? "Café quentinho": "Acabou o café");
        System.out.println(cafe.status());

    }
}
