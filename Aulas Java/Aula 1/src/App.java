import java.util.Scanner;

/**
 * @author     : João Mottin
 * @version    : 0.1
 * @deprecated : Está classe será substituída pela classe Minha
 */


 // Comentário de linha
/*
 * Comentário de bloco
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Variável primitivas
        int anoAtual = 2025;
        float numeroComVirgula = 48.85f;
        char letraFoda = 'a';
        boolean aprovado = true;

        //Sempre que for criar uma variável, você PRECISA criar com letra minúscula e o resto começa com letra maiúscula.
        //Começa com MINUSCULO = Variável
        //Começa com MAIUSCULO = 

        //TypeCast
        anoAtual = (int)numeroComVirgula;

        System.out.println("O ano é " + anoAtual);
        System.out.println("#########");

        numeroComVirgula = (float) anoAtual;
        System.out.println("O numero com virgula é: " + numeroComVirgula);


        // Wrapper Class
        String nome = new String("João Mottin");
        Integer numeroInteiro = 10;
        Float numerofloat = Float.valueOf(10.5f);
        Boolean presenca = false;

        String numero = "30";
        Float novoNumero = Float.parseFloat(numero);

        System.out.println("O novo numero + 5 é " + (novoNumero + 5) + ".");

        System.out.printf("o numero do formato é %.2f !%n", novoNumero);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entrada de texto");
        String texto = entrada.nextLine();
        System.out.println("O texto é " + texto);

        System.out.println("ENtrada de Inteiro: ");
        int entradaInteiro = entrada.nextInt();
        System.out.println("O valor digitado é " + entradaInteiro);
    }
}
