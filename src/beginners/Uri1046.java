package beginners;

/*
* ENUCIADO DO PROBLEMA [URI 1046]:
* Leia a hora de início e de término de um jogo, em horas. Em seguida,
* calcule a duração do jogo, sabendo que o jogo pode começar em um dia e
* terminar em outro, com duração máxima de 24 horas. A mensagem deve ser impressa
* em português “O JOGO DUROU X HORA (S)”
* */

import java.util.Scanner;
import java.io.IOException;

public class Uri1046 {
    public static void main(String[] args) throws IOException{
        /*
        * Criando variável para leitura dos dois valores inteiros
        * */
        Scanner input = new Scanner(System.in);
        /*
        * Criando uma string para receber os dois valores
        * E um array String para receber os valores individualizados
        * */
        String line;
        String[] arrayString;
        /*
        * Criando um array de inteiros para receber os valores
        * em String convertidos para int
        * */
        int[] arrayInt;
        /*
        * Criando um array de inteiros com 24 posições (o dia tem 24 horas)
        * */
        int[] horas = new int[24];
        /*
        * Criando variável "a" e "b" (inteiros) para facilitar
        * a legibilidade do cálculo
        * */
        int a,b;
        /*
        * Criando um contador, para ajudar na contagem das horas
        * */
        int cont = 0;
        /*
        * Lendo os valores do usuário
        * */
        line = input.nextLine();
        /*
        * Passando os valores da "line"
        * um a um para o "arrayString"
        * */
        arrayString = line.split(" ");
        arrayInt = new int[arrayString.length];
        /*
        * Convertendo os valores do "arrayString"
        * para inteiro e atribuindo para o "arrayInt"
        * */
        for(int i = 0;i < arrayInt.length; i++){
            arrayInt[i] = Integer.parseInt(arrayString[i]);
        }
        /*
        * Passando os valores do arrayInt para as variáveis
        * "a" e "b"
        * */
        a = arrayInt[0];
        b = arrayInt[1];
        /*
        * - Verificando se "a" e "b" são iguais, caso sejam
        * então obviamente o jogo durou 24 horas;
        * - Depois é verificado se "a" é menor que "b", caso seja
        * é feito a subtração da hora final para hora inicial
        * obtendo assim a duração do jogo;
        * - Por ultimo (sobra somente "se a > b") é feito uma verificação
        * de quantas casas existe do índice do valor de "a" até o índice final
        * do array, e cada casa o contador recebe "+1". Depois é verificado quantas
        * casas há da primeira casa do array, até o valor de "b", e também é
        * incrementado "+1" no contador, obtendo assim o valor final de duração
        * do jogo;
        * */
        if(a == b){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }else if(a < b){
            System.out.println("O JOGO DUROU " + (b - a) + " HORA(S)");
        }else{
            for (int i = a; i < horas.length; i++) {
                cont++;
            }
            for(int i = 0; i < b; i++){
                cont++;
            }
            System.out.println("O JOGO DUROU " + cont + " HORA(S)");
        }
    }
}
