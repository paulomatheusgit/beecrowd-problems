package beginners;

import java.util.Scanner;
import java.io.IOException;

public class Bee1016 {
    public static void main(String[] args) throws IOException{
        /*Criando a variável de leitura dos dados*/
        Scanner input = new Scanner(System.in);
        /*Criando a variável de recebimento do dado e a outra
        * do resultado*/
        int distancia,minutos;

        /*Lendo a distancia*/
        distancia = input.nextInt();

        /*Calculando o tempo*/
        minutos = distancia * 2;

        System.out.println(minutos + " minutos");
    }
}
