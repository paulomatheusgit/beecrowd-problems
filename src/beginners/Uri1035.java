package beginners;

/*
* ENUCIADO DO PROBLEMA [URI 1035]:
* Leia 4 valores inteiros A, B, C e D. Então, se B for maior do que C e D for maior do que A e se a soma
* de C e D for maior do que a soma de A e B e se C e D forem valores positivos e se A for par, escreva a mensagem
* “Valores aceitos”. Caso contrário, escreva a mensagem “Valores nao aceitos” (Valores não aceitos).
* */

import java.util.Scanner;
import java.io.IOException;

public class Uri1035 {
    public static void main(String[] args) throws IOException{
        /*
        * Criando variável para leitura dos valores
        * */
        Scanner input = new Scanner(System.in);
        /*
        * Criando as variáveis para armazenamento dos valores
        * */
        int a,b,c,d;
        /*
        * Lendo os valores pelo usuário e atribuindo as variáveis
        * */
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        /*
        * Fazendo as comparações e imprimindo as mensagens respectivas ao resultado
        * */
        if(b > c && d > a && (c + d) > (a + b) && (c > 0 && d > 0) && (a % 2 == 0)){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}
