package beginners;

import java.util.Scanner;
import java.io.IOException;

public class Bee1018 {
    public static void main(String[] args) throws IOException{
        /*Criando a variável para leitura do dado*/
        Scanner input = new Scanner(System.in);
        /*Criando um array para armazenar a qtd de notas bancárias*/
        int[] notas = new int[7];
        /*Criando uma variável "valor" para ser manipulada no laço de repetição
        * e a valorInserido para imprimir no final*/
        int valor,valorInserido;

        /*Lendo o valor e atribuindo a variável*/
        valor = input.nextInt();
        valorInserido = valor;

        /*Realizando um "enquanto"
        * Enquanto o valor for maior ou igual a 1 (a menor nota possível),
        * será realizado o processamento de: verificar se o valor inserido
        * é maior ou igual ao do valor da nota, atribuindo ao índice correspondente no
        * array da nota a quantidade de notas bancárias possíveis (que esse valor é obtido
        * através da divisão do valor pelo valor da nota bancária.
        * Depois a variável ''valor'' recebe um novo valor, dado pelo resto da divisão
        * dela pelo valor da nota.*/
        while(valor >= 1){
            if(valor >= 100){
                notas[0] = valor / 100;
                valor = valor % 100;
            }else if (valor >= 50){
                notas[1] =  valor / 50 ;
                valor = valor % 50;
            }else if (valor >= 20){
                notas[2] =  valor / 20;
                valor = valor % 20;
            }else if (valor >= 10){
                notas[3] =  valor / 10;
                valor = valor % 10;
            }else if (valor >= 5){
                notas[4] =  valor / 5;
                valor = valor % 5;
            }else if (valor >= 2){
                notas[5] =  valor / 2;
                valor = valor % 2;
            }else {
                notas[6] = valor;
                valor = 0;
            }
        }
        /*Imprimindo as informações*/
        System.out.println(valorInserido + "\n" + notas[0] + " nota(s) de R$ 100,00\n" + notas[1] + " nota(s) de R$ 50,00\n" +
                notas[2] + " nota(s) de R$ 20,00\n" + notas[3] + " nota(s) de R$ 10,00\n" + notas[4] +
                " nota(s) de R$ 5,00\n" + notas[5] + " nota(s) de R$ 2,00\n" + notas[6] + " nota(s) de R$ 1,00");
    }
}
