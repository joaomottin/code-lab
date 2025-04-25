import java.util.Scanner;

public class ex123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menu = true, calc;
        float valor1, valor2, resultado;
        int opcao, par, operacao;
        int[] vetor = new int[10];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }
        
        while (menu) {
            System.out.println("Escolha uma opção\n" +
                               "1 - Par ou Ímpar\n" +
                               "2 - Porcentagem IPI\n" +
                               "3 - Calculadora\n"+
                               "0 - Encerrar");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite 1 para Ímpar ou 2 para Par");
                    par = scanner.nextInt();
                    for (int v : vetor) {
                        if ((v % 2) == 0 && par == 2) {
                            System.out.println("Par " + v);
                        }
                        if ((v % 2) == 1 && par == 1) {
                            System.out.println("Ímpar " + v);
                        }
                    }
                break;
                case 2:
                    int quant1, quant2, cod1, cod2;
                    double ipi;
                    
                    System.out.println("Digite a porcentagem do IPI dos produtos:");
                    ipi = scanner.nextDouble();
            
                    System.out.println("Digite o código do produto 1: ");
                    cod1 = scanner.nextInt();
                    System.out.println("Digite o valor unitário do produto 1: ");
                    valor1 = scanner.nextFloat();
                    System.out.println("Digite a quantidade do produto 1: ");
                    quant1 = scanner.nextInt();
            
                    System.out.println("Digite o código do produto 2: ");
                    cod2 = scanner.nextInt();
                    System.out.println("Digite o valor unitário do produto 2: ");
                    valor2 = scanner.nextFloat();
                    System.out.println("Digite a quantidade do produto 2: ");
                    quant2 = scanner.nextInt();
            
                    double valorTotal = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);
            
                    System.out.println("\nResumo da compra:");
                    System.out.printf("Produto 1 (Código %d): %d unidades x R$ %.2f = R$ %.2f\n", 
                                      cod1, quant1, valor1, valor1 * quant1);
                    System.out.printf("Produto 2 (Código %d): %d unidades x R$ %.2f = R$ %.2f\n", 
                                      cod2, quant2, valor2, valor2 * quant2);
                    System.out.printf("Valor total com IPI: R$ %.2f\n", valorTotal);
                    System.out.printf("O valor do IPI ficou em R$ %.2f\n", (valorTotal - (valor1 * quant1 + valor2 * quant2)));

                break;
                case 3: 
                calc = true;
                while (calc == true) {
                    System.out.println("Escolha um operação:\n"+
                    "1 - Soma\n"+
                    "2 - Divisão\n"+
                    "3 - Subtração\n"+
                    "4 - Multiplicação\n"+
                    "5 - Potenciação\n"+
                    "9 - Voltar para o menu\n"+
                    "0 - Encerrar");
                    operacao = scanner.nextInt();
                    switch (operacao){
                        case 1:
                        System.out.println("Digite o valor 1");
                        valor1 = scanner.nextFloat();
                        System.out.println("Digite o valor 2");
                        valor2 = scanner.nextFloat();
                        System.out.println("O resultado da soma entre os valores é " + (valor1+valor2));

                        break;
                        case 2:
                        System.out.println("Digite o valor 1");
                        valor1 = scanner.nextFloat();
                        System.out.println("Digite o valor 2");
                        valor2 = scanner.nextFloat();
                        System.out.println("O resultado da divisão entre os valores é " + (valor1/valor2));
                        
                        break;
                        case 3:
                        System.out.println("Digite o valor 1");
                        valor1 = scanner.nextFloat();
                        System.out.println("Digite o valor 2");
                        valor2 = scanner.nextFloat();
                        System.out.println("O resultado da subtração entre os valores é " + (valor1-valor2));

                        break;
                        case 4:
                        System.out.println("Digite o valor 1");
                        valor1 = scanner.nextFloat();
                        System.out.println("Digite o valor 2");
                        valor2 = scanner.nextFloat();
                        System.out.println("O resultado da multiplicação entre os valores é " + (valor1*valor2));

                        break;
                        case 5:
                        System.out.println("Digite o valor da base");
                        valor1 = scanner.nextFloat();
                        System.out.println("Digite o valor do expoente");
                        valor2 = scanner.nextInt();
                        
                        resultado = 1;
                        for (int i = 1; i <= valor2; i++) {
                            resultado *= valor1;
                        }
                        
                        System.out.printf("O resultado de %.2f elevado a %.0f é %.2f\n", valor1, valor2, resultado);
                        break;
                        case 9:
                        calc = false;

                        break;
                        case 0:
                        menu = false;
                        calc= false;
                        encerrar();
                        }

                }   
                break;
                case 9:
                calc = false;

                break;
                case 0:
                    menu = false;
                    calc= false;
                    encerrar();

                break;
                default:
                    System.out.println("Digite um número válido");
                    break;
            }
        }
    }

    public static float pedirUmFloat(String texto){
        Scanner entrada = new Scanner (System.in);
        //float resposta;
        System.out.println("Digite o valor " + texto);
        //resposta = entra.nextString();
        //
    }

    public static void encerrar (){
        System.out.println("O sistema será encerrado");
    }
}

