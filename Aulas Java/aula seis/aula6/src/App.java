import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, ano;
        LocalDate dataAtual, dataEspecifica, dataConvertida;
        Month objetoMes;
        DateTimeFormatter frmtExibir, frmtReceber, frmtHora;
        String dataString, horaFormatada, texto;
        LocalTime horaAtual, horaFutura, meioDia;
        System.out.println("Trabalhando com Datas em Java");
/*
        dataAtual = LocalDate.now();
        System.out.println("Data Atual " + dataAtual);

        dataEspecifica = LocalDate.of(2025, 3, 28);
        System.out.println("Data Especifica " + dataEspecifica);

        dia = dataAtual.getDayOfMonth();
        mes = dataAtual.getMonthValue();
        ano = dataAtual.getYear();

        System.out.println("Dia " + dia);
        System.out.println("Mes " + mes);
        System.out.println("Ano " + ano);

        objetoMes = dataAtual.getMonth();
        //TextStyle.SHORT -> Mostra Abreviado TextStyle.NARROW -> Mostra uma letra
        System.out.println(objetoMes.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")));

        System.out.println("Digite uma data (dd/MM/yyyy)");
        dataString = entrada.nextLine();

        frmtReceber = DateTimeFormatter.ofPattern("dd/MM/yyyy"); */
        frmtExibir = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", new Locale("en", "USA")); /*

        dataConvertida = LocalDate.parse(dataString, frmtReceber);
        System.out.println("Data convertida " + dataConvertida);

        System.out.println("Data Atual " + dataAtual.format(frmtReceber));
        System.out.println("Data Convertida " + dataConvertida.format(frmtExibir));

        System.out.println("\n\n LocalTime\n");

        horaAtual = LocalTime.now();
        System.out.println("Hora Atual: " + horaAtual);

        horaFutura = horaAtual.plusHours(1);
        horaFutura = horaFutura.plusMinutes(10);

        System.out.println("Hora Atual somando 1:10 " + horaFutura);

        horaFutura = horaFutura.minusHours(1);
        horaFutura = horaFutura.minusMinutes(10);

        System.out.println("Hora Futura menos 1:10 " + horaFutura);

        frmtHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        horaFormatada = horaFutura.format(frmtHora);
        System.out.println("Hora formatada " + horaFormatada);


        meioDia = LocalTime.of(12,0);
        System.out.println("é antes do meio dia? " + horaAtual.isBefore(meioDia));
*/
        System.out.println("\n\n Manipulação de String\n");

        texto = "   Hello, world!   ";

        System.out.println("Texto Original: " + texto);
        System.out.println("Tamanho do texto " + texto.length());
        System.out.println("Todas as letras MAIUSCULO " + texto.toUpperCase());
        System.out.println("Todas as letras em minusculo " + texto.toLowerCase());
        System.out.println("Remover os espaços extras " + texto.trim());
        System.out.println("Substituindo palavras " + 
        texto.trim().replace("Hello", "Hi").replace("!", "?"));


        System.out.println("Extraindo parte da string "+ texto.substring(7)); // Seleciona só onde eu quiser e começa dali
        System.out.println("Extraindo parte do texto "+texto.substring(3,8));
        System.out.println("Verificando se a string tem 'Hello'"+texto.toLowerCase().contains("hello")); // Procurar coisas no texto
        System.out.println("Verificando se o texto inicia com 'Hello'"+ texto.trim().startsWith("Hello")); // TRIM remove os espaços anteriores pq se deixar ele retorna falso
        System.out.println("Verificando se o texto termina com 'world!'"+texto.endsWith("world!")); // se deixar sem o TRIM, ele retorna um valor false, visto que o texto terminar com "   ", e não com "world!"
        System.out.println("Indice da primeira letra 'o' "+texto.indexOf("o"));
        System.out.println("Indice da ultima letra 'o' "+texto.lastIndexOf("o"));
        System.out.println("Removendo espaços em branco com ReplaceAll"+texto.replaceAll(" ",""));

        System.out.println("Separando a string em um valor de substring");

        String[] partes = texto.split(",");
        for (String s : partes){
            System.out.println(s.trim());
        }

        if(texto.trim().equalsIgnoreCase("Hello, world!")) {
            System.out.println("É igual"); // Compara se os valores dentro da string são o mesmo, tirando os espaços adicionais e letras maiúsculas e minúsculas
        }

        //Adicionando Máscara
        String cpf = "12345678901";
        String cpfFormatado = cpf.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        System.out.println("CPF Formatado "+cpfFormatado);

        String telefone = "41997472580";
        String telefoneFormatado = telefone.replaceFirst("(\\d{2})(\\d{5})(\\d{4})", "($1)$3-$2"); //Valores dentro dessa porra não precisam seguir uma ordem, da pra colocar na posição que quiser
        System.out.println("Telefone Formatado com valores invertidos "+telefoneFormatado);



        System.out.println("Digite uma nova data ");
        String novaData = entrada.nextLine();

        String[] simbolos = {"\\\\", "/", "\\-", "\\.", "\\*"};
        for (String s : simbolos){
            novaData=novaData.replaceAll(s, "");
        }
        System.out.println("Removendo simbolos"+novaData);

        System.out.println("A data digitada é "+novaData.substring(0,2) + "/" +
        novaData.substring(2,4) + "/" +novaData.substring(4,8) + ".");

        LocalDate dataFinal = LocalDate.parse(novaData,DateTimeFormatter.ofPattern("ddMMyyyy"));
        System.out.println(dataFinal.format(frmtExibir));





    }
}
