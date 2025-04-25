import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * .next() -> Entrada de uma PALAVRA
         * .nextLine() -> Entrada de uma LINHA
         * .nextInt() -> Entrada de um INTEIRO
         * .nextFloat() -> Entrada de um FLOAT
         * .nextLong() -> Entrada de um LONG
         * .nextBoolean() -> Entrada de um booleano
         */


        Scanner entrada = new Scanner (System.in);

        int valor1= 5;
        int valor2 = 10;
        int soma, subtracao, divisao, multiplicacao, restoDivisao, anoNascimento, idade;
        String texto;

        System.out.println("Operações matemáticas");
        soma = valor1 + valor2;
        subtracao = valor1 - valor2;
        divisao = valor1 / valor2;
        multiplicacao = valor1 * valor2;
        restoDivisao = valor1 % 2;
    
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Resto da divisão: " + restoDivisao);

        //Incremente e Decremento

        /*
         Se você colocar o ++ ANTES, o valor impresso já é com o 1 adicionado.
         Caso você coloque o ++ DEPOIS, o valor impresso será IGUAL AO ORIGINAL, mas a variável passa a valer 6, e só vai ser mostrada como 6 caso você imprima novamente.
        */
        System.out.println("Incremento Valor1 = " + ++valor1);
        System.out.println("Incremento Valor2 = " + valor2++);

        System.out.println("Decremento Valor1 = " + --valor1);
        System.out.println("Decremento Valor2 = " + valor2--);

        //Estrutura de Decisão

        if (valor2 != 10) {
            System.out.println("Valor2 é diferente de 10");
        }
        else if (valor2 == 10) {
            System.out.println("Valor2 é igual a 10");
        }
        if (valor1 != 5) {
            System.out.println("Valor1 é diferente de 5");
        }
        else if (valor1 == 5) {
            System.out.println("Valor1 é igual a 5");
        }

        switch (valor1) {
            case 10:
                     System.out.println("Valor1 é 10");
                break;
            case 5:
                     System.out.println("Valor1 é 5");
                break;
            case 2:
                     System.out.println("Valor1 é 2");
                break;
            default:
            System.out.println("Nenhum dos casos");
                break;
        }

        //Operador Ternário

        //System.out.println("Digite o ano de seu nascimento");
        //anoNascimento = entrada.nextInt();
        //idade = 2025 - anoNascimento;
        //System.out.println("Você terá "+ idade + " anos em 2025!");
            //if (idade < 18) {
            //    System.out.println("Você ainda é menor de idade!");
            //}
            //else {
            //    System.out.println("Você já é maior de idade!");
            //}

            //(Teste Lógico) ? Bloco Verdadeiro : Bloco Falso;

            //texto = (idade >= 18)? "Usuário maior de idade" : "Usuário menor de idade";
            //System.out.println(texto);

            //texto = (idade >= 18)? "maior":"menor";
            //System.out.println("Usuário " + texto +" de idade");
            //System.out.println((idade >= 18)? "Usuário maior de idade":"Usuário menor de idade");

            //Estruturas de Laço
            System.out.println("\nWhile");
            while (valor1 > 0) {
                System.out.println("Valor1 é " + --valor1);
            }

            System.out.println("\nDo while");
            do {
                System.out.println("Valor1 é " + valor1++);
            } while (valor1 < 5);
            //System.out.println(valor1);

            System.out.println("\nFor");
            int vetor[] = {5,7,8,9,3,2,1};
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Vetor posição: "+i+" é igual a "+vetor[i]);
            }
            //QUEBRANDO O FOR POR COMPLETO (Exemplo acima / Resultado abaixo)
            //int i = 0;
            //for ( ; ; ) {
            //    if (i < vetor.length) {
            //        System.out.println("Vetor posição: "+i+" é igual a "+vetor[i++]);
            //    }
            //    else {
            //        break;
            //    }
            //}

            for (int v: vetor){
                System.out.println("O valor é "+v);
            }


    }
}

/*
    Código demonstrando conceitos básicos de Java:

    1. Entrada de dados com Scanner (comentado).
    2. Operações matemáticas: soma, subtração, divisão, multiplicação e resto da divisão.
    3. Incremento e decremento: pré e pós-incremento/decremento.
    4. Estruturas de decisão:
       - if-else para verificações condicionais.
       - switch-case para múltiplas condições.
    5. Operador ternário (comentado).
    6. Estruturas de repetição:
       - while: executa enquanto a condição for verdadeira.
       - do-while: executa pelo menos uma vez antes da verificação.
       - for: percorrendo arrays e utilizando o for-each.
    
    Código útil para aprender e revisar lógica de programação em Java!
*/