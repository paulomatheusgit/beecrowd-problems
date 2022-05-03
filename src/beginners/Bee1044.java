package beginners;

import java.util.Scanner;
import java.io.IOException;

public class Bee1044 {
    public static void main(String[] args) throws IOException{
        /*
        * Criando a variável de leitura dos valores
        * */
        Scanner input = new Scanner(System.in);
        /*
        * Criando as variáveis para manipulação dos dados
        * */
        int a,b;
        String line;
        String[] arrayLine;
        /*
        * Lendo os dados e atribuindo para a variável "line"
        * */
        line = input.nextLine();
        /*
        * Separando os valores e passando para o array "arrayLine"
        * */
        arrayLine = line.split(" ");
        /*
        * Convertendo os valores do array para inteiro e atribuindo
        * para as variáveis "a" e "b"
        * */
        a = Integer.parseInt(arrayLine[0]);
        b = Integer.parseInt(arrayLine[1]);
        /*
        * Verificando se os valores são iguais (se forem, sao multiplos)
        * se o primeiro valor (variavel "a") for maior que o segundo (vari-
        * avel "b") ele será o dividendo, e tendo resto zero (0) eles são
        * multiplos.
        * O outro if é a mesma coisa, mudando que se o segundo valor for maior
        * ele será o dividendo, e o primeiro o divisor.
        * */
        if(a == b){
            System.out.println("Sao Multiplos");
        }else if(a > b){
            if((a % b) == 0){
                System.out.println("Sao Multiplos");
            }else{
                System.out.println("Nao sao Multiplos");
            }
        }else{
            if((b % a) == 0){
                System.out.println("Sao Multiplos");
            }else{
                System.out.println("Nao sao Multiplos");
            }
        }
    }
}
