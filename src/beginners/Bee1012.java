package beginners;

import java.util.Scanner;
import java.io.IOException;

public class Bee1012 {
    public static void main(String[] args) throws IOException{
        /*Criando variável de leitura das informações*/
        Scanner input = new Scanner(System.in);

        /*Criando o valor de pi segundo o valor da questão*/
        final double pi = 3.14159;
        /*Criando a variável que vai receber os valores de forma integral*/
        String line;
        /*Criando o array que vai receber os valores individualmente*/
        String[] valores;
        /*Criando a variável que vai receber o resultado da area*/
        double area;

        /*Recebendo os valores
        * OBS: Os valores "double" inseridos devem ser
        * utilizado ponto (.) ao invés de vírgula(,)
        * Exemplo: 4.65 ao invés de 4.65*/
        line = input.nextLine();
        /*Passando os valores para o array*/
        valores = line.split(" ");

        /* ******************* */
        /*Valor de A = valor[0]
        * Valor de B = valor[1]
        * Valor de C = valor[2]*/
        /* ******************* */

        /*
        AREA DO TRIANGULO RETANGULO:
        * (AREA = BASE * ALTURA) / 2
        */
        area = (Double.parseDouble(valores[0]) * Double.parseDouble(valores[2])) / 2;
        System.out.printf("TRIANGULO: %.3f%n",area);

        /*
        AREA DO CIRCULO:
        * AREA = PI * (RAIO*RAIO)
        * */
        area = pi * Math.pow(Double.parseDouble(valores[2]),2);
        System.out.printf("CIRCULO: %.3f%n",area);

        /*
        * AREA DO TRAPEZIO:
        * AREA = ((BASE MAIOR + BASE MENOR) * ALTURA) / 2
        * */
        area = ((Double.parseDouble(valores[0]) + Double.parseDouble(valores[1])) *
                Double.parseDouble(valores[2])) / 2;
        System.out.printf("TRAPEZIO: %.3f%n",area);

        /*
        * AREA DO QUADRADO:
        * AREA = LADO * LADO
        * */
        area = Math.pow(Double.parseDouble(valores[1]),2);
        System.out.printf("QUADRADO: %.3f%n",area);

        /*
        * AREA DO RETANGULO:
        * AREA = BASE * ALTURA
        * */
        area = Double.parseDouble(valores[0]) * Double.parseDouble(valores[1]);
        System.out.printf("RETANGULO: %.3f%n",area);
    }
}
