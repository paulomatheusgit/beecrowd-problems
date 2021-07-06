package beginners;

import java.util.Scanner;
import java.io.IOException;

public class Uri1011 {
    public static void main(String[] args) throws IOException{
        /*Criando a variavel que vai ler a informação*/
        Scanner input = new Scanner(System.in);

        /*Ciando a variável com o valor de pi*/
        final double pi = 3.14159;

        /*Criando a variável que vai receber a informação e
        * a variável que vai receber o resultado (volume)*/
        double radius,volume;

        /*Recebendo o valor pelo usuario*/
        radius = input.nextDouble();

        /*Calculando o volume*/
        volume = (4.0/3.0) * pi * (radius * radius * radius);

        System.out.printf("VOLUME = %.3f%n",volume);
    }
}
