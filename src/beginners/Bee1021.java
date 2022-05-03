package beginners;
/*
* ENUCIADO DO PROBLEMA: [URI1021]
* Leia um valor de ponto flutuante com duas casas decimais. Isso representa um valor monetário. Depois disso, calcule
* o menor número possível de notas e moedas nas quais o valor pode ser decomposto. As notas consideradas são de 100, 50,
* 20, 10, 5, 2. As moedas possíveis são de 1, 0,50, 0,25, 0,10, 0,05 e 0,01. Imprima a mensagem “NOTAS:” seguida da
* lista de notas e a mensagem “MOEDAS:” seguida da lista de moedas.
* */
import java.math.BigDecimal;
import java.util.Scanner;
import java.io.IOException;

public class Bee1021 {
    public static void main(String[] args) throws IOException{
        /*
        Criando a variável para leitura do valor
        */
        Scanner input = new Scanner(System.in);
        /*
        Criando variável para receber o valor, e array's para os valores
        * das notas e moedas
        * OBS: É recomendado utilizar BigDecimal para valores monetários ao invés
        * de double ou float, devido a precisão que o primeiro tem em comparação
        * aos outros
        * */
        BigDecimal valor;
        BigDecimal[] notas = new BigDecimal[6];
        BigDecimal[] moedas = new BigDecimal[6];
        /*
        * Criando um array para a quantidade de Notas e de Moedas respectivamente
        * */
        int[] qtdNotas = new int[6];
        int[] qtdMoedas = new int[6];
        /*
        * Atribuindo para o array de Notas os valores de cada uma
        * */
        notas[0] = new BigDecimal("100");
        notas[1] = new BigDecimal("50");
        notas[2] = new BigDecimal("20");
        notas[3] = new BigDecimal("10");
        notas[4] = new BigDecimal("5");
        notas[5] = new BigDecimal("2");
        /*
        * Atribundo para o array de Moedas os valores de cada uma
        * */
        moedas[0] = new BigDecimal("1.00");
        moedas[1] = new BigDecimal("0.50");
        moedas[2] = new BigDecimal("0.25");
        moedas[3] = new BigDecimal("0.10");
        moedas[4] = new BigDecimal("0.05");
        moedas[5] = new BigDecimal("0.01");
        /*
        * Lendo o valor inserido pelo usuário e atribuindo a variável
        * */
        valor = input.nextBigDecimal();
        /*
        * Aqui é feito um 'for' para percorrer os índices do array
        * e depois um 'while' que vai adicionar no array de 'qtdNotas'
        * +1 enquanto o resultado do compareTo (que compara o valor da
        * nota com o valor inserido pelo usuário) for menor que 1. (O
        * compareTo retorna -1 se for menor, 0 se for igual e 1 se
        * for maior).
        * */
        for(int i = 0; i < notas.length; i++){
            while(notas[i].compareTo(valor) < 1){
                ++qtdNotas[i];
                valor = valor.subtract(notas[i]);
            }
        }
        /*
         * Mesma lógica do for e while anterior, mas agora
         * com moedas.
         * */
        for(int i = 0; i < moedas.length; i++){
            while(moedas[i].compareTo(valor) < 1){
                ++qtdMoedas[i];
                valor = valor.subtract(moedas[i]);
            }
        }
        /*
        * Imprimindo os valores com o formato pedido pelo
        * problema.
        * */
        System.out.println("NOTAS:");
        for(int i = 0; i < qtdNotas.length; i++){
            System.out.printf("%d nota(s) de R$ %.2f%n",qtdNotas[i],notas[i]);
        }
        System.out.println("MOEDAS:");
        for(int i = 0; i < qtdMoedas.length; i++){
            System.out.printf("%d moeda(s) de R$ %.2f%n",qtdMoedas[i],moedas[i]);
        }
    }
}