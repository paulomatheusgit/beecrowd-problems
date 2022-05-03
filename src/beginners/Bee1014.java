package beginners;

import java.util.Scanner;
import java.io.IOException;

public class Bee1014 {
    public static void main(String[] args) throws IOException{
        /*Criando a vairável de leitura dos dados*/
        Scanner input = new Scanner(System.in);
        /*Criando as variável que irão receber os dados*/
        int km;
        float l,consumo;

        /*Pegando os valores e atribuindo as variáveis respectivas*/
        km = input.nextInt();
        l = input.nextFloat();

        /*calculo do consumo*/
        consumo = km / l;

        /*Imprimindo o resultado*/
        System.out.printf("%.3f km/l%n",consumo);
    }
}
