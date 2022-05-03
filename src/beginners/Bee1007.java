package beginners;

import java.io.IOException;
import java.util.Scanner;

public class Bee1007 {
    public static void main(String[] args) throws IOException{
        /*Criando uma variável para leitura de informações*/
        Scanner input = new Scanner(System.in);
        int a,b,c,d,diferenca;

        /*Capturando os valores*/
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        /*Fórmula para o resultado*/
        diferenca = (a*b) - (c*d);

        System.out.println("DIFERENCA = " + diferenca);
    }
}
