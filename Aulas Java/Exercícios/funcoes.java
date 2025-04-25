import java.util.Scanner;

public class funcoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ddd, telefone;
        int[] vetorInteiro = new int[5];
        float[] vetorFloat = new float[5];
        String nome, sobrenome;

        System.out.println("Correção Lista 2");

        // Exercicio 1
        System.out.println("Exercício 1 - Número PI");
        System.out.println(pi());

        // Exercicio 2
        System.out.println("\nExercício 2 - Fatorial");
        System.out.print("Digite um número para calcular o fatorial: ");
        int num = entrada.nextInt();
        System.out.println("Fatorial de " + num + " é " + fatorial(num));

        // Exercicio 3
        System.out.println("\nExercício 3 - Maior Número");
        for (int i = 0; i < vetorInteiro.length; i++) {
            System.out.print("Digite um valor inteiro: ");
            vetorInteiro[i] = entrada.nextInt();
        }
        System.out.println("Maior número é " + maiorNumero(vetorInteiro));

        // Exercicio 4
        System.out.println("\nExercício 4 - Soma do vetor");
        for (int i = 0; i < vetorFloat.length; i++) {
            System.out.print("Digite um float: ");
            vetorFloat[i] = entrada.nextFloat();  // Corrigido de nextInt() para nextFloat()
        }
        System.out.println("Soma dos valores é " + somaVetor(vetorFloat));

        // Exercicio 5
        entrada.nextLine(); // Consumir quebra de linha pendente
        System.out.println("\nExercício 5 - Cliente");
        System.out.print("Digite o nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite seu sobrenome: ");
        sobrenome = entrada.nextLine();
        System.out.print("Digite seu DDD: ");
        ddd = entrada.nextInt();
        System.out.print("Digite seu telefone: ");
        telefone = entrada.nextInt();

        // Exibir os dados do cliente formatados
        System.out.println("\nDados do Cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("DDD: " + ddd);
        System.out.println("Telefone: " + telefone);

        entrada.close(); // Fechando o Scanner
    }

    public static float pi() {
        return 3.14f;
    }

    public static int fatorial(int fat) {
        if (fat < 0) return -1; // Tratamento para números negativos
        int res = 1;
        for (int i = fat; i > 1; i--) {
            res *= i;
        }
        return res;
    }

    public static int maiorNumero(int[] vetor) {
        int res = vetor[0];
        for (int v : vetor) {
            if (v > res) {
                res = v; // Corrigido erro de lógica (faltava atribuição)
            }
        }
        return res;
    }

    public static float somaVetor(float[] vetor) {
        float soma = 0;
        for (float v : vetor) {
            soma += v;
        }
        return soma;
    }
}
