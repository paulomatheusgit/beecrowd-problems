package beginners;

/*
* ENUCIADO DO PROBLEMA [URI 1037]:
* Você deve fazer um programa que leia um número de ponto flutuante e imprimir uma mensagem dizendo a
* qual dos seguintes intervalos o número pertence: [0,25] (25,50], (50,75], (75,100]. Se o número for menor que zero
* ou maior que 100, o programa deve imprimir a mensagem “Fora de intervalo”.

O símbolo '(' representa maior que. Por exemplo:
[0,25] indica números entre 0 e 25,0000, incluindo ambos.
(25,50] indica números maiores que 25 (25,00001) até 50,0000000.
* */

import java.util.Scanner;
import java.io.IOException;

public class Uri1037 {
    public static void main(String[] args) throws IOException{
        /*
        * Criando variável para leitura do valor
        * */
        Scanner input = new Scanner(System.in);
        /*
        * Criando variável para atribuição do valor
        * */
        double valor;
        valor = input.nextDouble();
        /*
        * Fazendo as comparações
        * */
        if(valor >= 0 && valor <= 25){
            System.out.println("Intervalo [0,25]");
        }else if(valor > 25 && valor <= 50){
            System.out.println("Intervalo (25,50]");
        }else if(valor > 50 && valor <= 75){
            System.out.println("Intervalo (50,75]");
        }else if(valor > 75 && valor <= 100){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
    }
}
