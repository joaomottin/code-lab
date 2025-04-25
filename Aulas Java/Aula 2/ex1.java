//Crie um vetor de tamanho 10 com números pares e impares, com
//o vetor previamente criado o usuário deverá escolher se serão mostrados
//apenas os números pares ou apenas os números impares, os números
//devem ser exibidos conforme a escolha do usuário.

import java.util.Scanner;

public class ex1 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception  {
    Scanner entrada = new Scanner (System.in);

    int vetor[] = {1,2,3,4,5,6,7,8,9,10};
    int escolha;

    System.out.println("Valores disponíveis: 1,2,3,4,5,6,7,8,9 e 10");
    System.out.println("Selecione 1 para ver os valores IMPARES");
    System.out.println("Selecione 2 para ver os valores PARES");
    escolha = entrada.nextInt();

        switch (escolha) {
            case 1: 
                for (int i = 0; i < vetor.length; i++) {
                    if (vetor[i] % 2 == 1) {
                        System.out.println(vetor[i]); //Número ímpar
                    }
                }
                break;
            case 2: 
                for (int i = 0; i < vetor.length; i++) {
                    if (vetor[i] % 2 == 0) {
                        System.out.println(vetor[i]); //Número par
                    }
                }
                break;
            default:
            System.out.println("erro");
                break;
        }

        //if (escolha == 1){
        //    System.out.println("Os valores IMPARES são: 1, 3, 5, 7 e 9");
        //}
        //else if (escolha == 2){
        //    System.out.println("Os valores PARES são: 2, 4, 6, 8 e 10");
        //}
    }

    @Override
    public String toString() {
        return "ex1 []";
    }
}
