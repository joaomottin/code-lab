//Crie um sistema que receba os seguintes valores:
//A porcentagem do IPI a ser acrescido no valor dos produtos
//O código do produto 1
//O valor unitário do produto 1
//A quantidade do produto 1
//O código do produto 2
//O valor unitário do produto 2
//A quantidade do produto 2
//Com todos os parâmetros informados o sistema deve calcular o valor
//total a ser pago e apresentar o resultado detalhado.
//Fórmula: (valor1*quant1 + valor2*quant2)*(IPI/100 + 1).
import java.util.Scanner;

public class ex2 {
    /**
     * @param args
     * @throws Exception
     */

    public static void main(String[] args) throws Exception  {
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner (System.in);

        int quant1, quant2, cod1, cod2;
        float valor1, valor2;
        double ipi;

        System.out.println("Digite a porcentagem do IPI dos produtos:");
        ipi = entrada.nextDouble();

        System.out.println("Digite o código do produto 1: ");
        cod1 = entrada.nextInt();
        System.out.println("Digite o valor unitário do produto 1: ");
        valor1 = entrada.nextFloat();
        System.out.println("Digite a quantidade do produto 1: ");
        quant1 = entrada.nextInt();

        System.out.println("Digite o código do produto 2: ");
        cod2 = entrada.nextInt();
        System.out.println("Digite o valor unitário do produto 2: ");
        valor2 = entrada.nextFloat();
        System.out.println("Digite a quantidade do produto 2: ");
        quant2 = entrada.nextInt();

        double valorTotal = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

        System.out.println("\nResumo da compra:");
        System.out.printf("Produto 1 (Código %d): %d unidades x R$ %.2f = R$ %.2f\n", 
                          cod1, quant1, valor1, valor1 * quant1);
        System.out.printf("Produto 2 (Código %d): %d unidades x R$ %.2f = R$ %.2f\n", 
                          cod2, quant2, valor2, valor2 * quant2);
        System.out.printf("Valor total com IPI: R$ %.2f\n", valorTotal);
        
    }    
}
