/*
1 – Escreva uma função que ao ser chamada retorne 3,14.
2 – Escreva uma função que recebe um inteiro e retorna o fatorial dele.
3 – Escreva uma função que recebe um vetor de inteiros e retorna o
maior número do vetor.
4 – Escreva uma função que recebe um vetor de float e retorna a soma de
todas as posições dele.
5 – Escreva uma função que receba os dados de um cliente e retorne eles
formatados, mostrado um dado por linha.
Exemplo
Nome: João
Sobrenome: Silva
DDD: 41
Telefone: 12346543 
*/

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args){
        System.out.println(pi());
            
        Scanner entrada = new Scanner (System.in);
        int fatorial, ddd, telefone;
        int[] vetorInteiro = new int[5];
        float[] vetorFloat = new float[5];
        String nome, sobrenome;

        System.out.println("Correção Lista 2");

        System.out.println("Exercício 1 - Número PI");
        System.out.println(pi());


        System.out.println("Exercicio 3 - Maior Número");
        for (int i=0;i<vetorInteiro.lenght;i++){
            System.out.println("Digite um valor inteiro:");
            vetorInteiro[i] = entrada.nextInt();
        }
        System.out.println("Maior número é "+ maiorNumero(vetorInteiro));



        System.out.println("Exercício 4 - Soma do vetor");
        for (int i=0;i<vetorFloat.lenght;i++){
            System.out.println("Digite um float:");
            vetorFloat[i] = entrada.nextInt();
        }
        System.out.println("Soma dos valores é "+ somaVetor(vetorFloat));


        System.out.println("Exercicio 5 - Cliente");
        System.out.println("Digite o nome");
        nome = entrada.nextLine();
        System.out.println("Digite seu sobrenome");
        sobrenome = entrada.nextLine();
        System.out.println("Digite seu DDD");
        ddd = entrada.nextInt();
        System.out.println("Digite seu telefone");
        telefone = scanner.nextInt();


    }

    public static float pi (){
        return 3.14f;
    }

    public static int fatorial (int fat){
        int res = fat;
        for (--fat;fat>1;fat--){
            res *= fat;
        }
        return res;
    }

    public static int maiorNumero (int[] vetor){
        int res = vetor[0];
        for (int v : vetor) {
            if (v > res)
        }
    }

    public static float somaVetor(float[] vetor) {
        float soma = 0;
        for (float v : vetor) {
            soma += v;
        }
        return soma;


        
}
