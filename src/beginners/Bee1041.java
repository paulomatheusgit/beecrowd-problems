package beginners;

/*
* ENUCIADO DO PROBLEMA [URI 1041]:
* Escreva um algoritmo que leia dois valores flutuantes (x e y), que devem representar as coordenadas
* de um ponto em um plano. Em seguida, determine a qual quadrante o ponto pertence ou se você está em
* um dos eixos cartesianos ou na origem (x = y = 0).
* */

import java.util.Scanner;
import java.io.IOException;

public class Bee1041 {
    public static void main(String[] args) throws IOException{
        /*
        * Criando a variável para leitura dos dados
        * */
        Scanner input = new Scanner(System.in);
        /*
        * Criando a variável que vai receber a linha com os valores
        * e um array que vai individualizar os valores
        * */
        String line;
        String[] eixos;
        /*
        * Criando as variável que irão receber os valores individualizados e convertidos;
        * */
        float x,y;
        /*
        * Recebendo os valores em uma só linha
        * */
        line = input.nextLine();
        /*
        * Dividindo os valores da linha para um array
        * */
        eixos = line.split(" ");
        /*
        * O primeiro valor é referente ao eixo X e o segundo ao eixo Y
        * */
        x = Float.parseFloat(eixos[0]);
        y = Float.parseFloat(eixos[1]);
        /*
        * Fazendo as verificações dos Quadrantes, e dos eixos
        * */
        if (x == 0 && y == 0){
            System.out.println("Origem");
        }else if((x == 0 && y > 0) || (x == 0 && y < 0)){
            System.out.println("Eixo Y");
        }else if((x > 0 && y == 0) || (x < 0 && y == 0)){
            System.out.println("Eixo X");
        }else if(x > 0 && y > 0){
            System.out.println("Q1");
        }else if(x < 0 && y > 0){
            System.out.println("Q2");
        }else if(x < 0 && y < 0){
            System.out.println("Q3");
        }else{
            System.out.println("Q4");
        }
    }
}
