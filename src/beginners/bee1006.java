package beginners;

import java.util.Scanner;

public class bee1006 {
    public static void main(String[] args) {
        /*Criando uma variável para leitura de informações*/
        Scanner input = new Scanner(System.in);
        float a,b,c,average;

        /*Capturando os valores*/
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();

        /*Fórmula para a média*/
        average = ((a*2) + (b*3) + (c*5))/10;
        System.out.printf("MEDIA = %.1f%n", average);
    }
}
