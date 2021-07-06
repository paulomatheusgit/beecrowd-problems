package beginners;

import java.util.Scanner;
import java.io.IOException;

public class Uri1013 {
    public static void main(String[] args) throws IOException{

        /*Criando a variável para leitura dos valores*/
        Scanner input = new Scanner(System.in);
        /*Criando a variável para armazenamento dos valores*/
        String line;
        /*Criando o array que vai receber em seus índices os valores
        * individualmente*/
        String[] valores;
        /*As variáveis que vão receber os valores dos índices do array.
        * (Para facilitar no entendimento do uso da fórmula)*/
        int a,b,c,maiorAb,maior;

        /*Recebendo os valores*/
        line = input.nextLine();

        /*Passando os valores recebidos um a um para o array*/
        valores = line.split(" ");

        /*Convertendo os valores em inteiro e atribuindo os valores
        * para as variáveis correspondentes*/
        a = Integer.parseInt(valores[0]);
        b = Integer.parseInt(valores[1]);
        c = Integer.parseInt(valores[2]);

        /*Utilizando a fórmula dada pelo problema para encontrar o maior
        * (primeiramente entre A e B)*/
        maiorAb = (a+b+Math.abs(a-b)) / 2;

        /*Agora que ja tem o maior entre A e B, é hora de comparar o resultado
        * com C (no caso é o valor da variável 'maiorAb' com 'c')*/
        /*A fórmula utilizada abaixo é a mesma utilizada acima, só muda
        * as variáveis utilizadas*/
        maior = (maiorAb+c+Math.abs(maiorAb-c))/2;
        System.out.println(maior + " eh o maior");
    }
}
