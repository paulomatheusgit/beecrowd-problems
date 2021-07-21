package beginners;
/*
* ENUCIADO DO PROBLEMA [URI 1019]:
* Leia um valor inteiro, que é a duração em segundos de um determinado evento em uma fábrica, e informe-o
* expresso em horas:minutos:segundos.
 */
import java.util.Scanner;
import java.io.IOException;

public class Uri1019 {
    public static void main(String[] args) throws IOException{
        //Criando a variável para leitura do dado
        Scanner input = new Scanner(System.in);
        /*Criando as variáveis para horas, minutos e segundos*/
        int horas,minutos,segundos;

        //Pegando o valor em segundos, pelo usuário.
        segundos = input.nextInt();

        /*Verifica se o valor inserido (em segundos) é maior que 60.
        * Se for, já converte para minutos (dividindo por 60) e atribui o resto
        * para a variável segundos
        * Se o valor inserido não for maior nem igual a 60 (ele logicamente é menor)
        * logo, os minutos não poderão ser outro valor a não ser zero (0)*/
        if(segundos >= 60){
            minutos = segundos / 60;
            segundos = segundos % 60;
        }else{
            minutos = 0;
        }
        /*Verifica se o valor atual dos minutos é maior que 60.
         * Se for, já converte para horas (dividindo por 60) e atribui o resto
         * para a variável minutos. Se o valor de minutos não for maior nem igual a
         * 60 (ele logicamente é menor), logo, as horas não poderão ser outro valor
         * a não ser zero (0)*/
        if(minutos >= 60){
            horas = minutos / 60;
            minutos = minutos % 60;
        }else{
            horas = 0;
        }
        //Imprimindo os valores no formato pedido pelo enuciado do problema
        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}
