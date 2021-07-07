package beginners;

import java.util.Scanner;
import java.io.IOException;

public class Uri1015 {
    public static void main(String[] args) throws IOException{
        /*Criando a variável de leitura dos dados*/
        Scanner input = new Scanner(System.in);
        /*O problema pediu a inserção de 4 valores em 2 linhas
        * diferentes, então vamos criar uma String para cada linha*/
        String line1,line2;
        /*Vamos criar aqui 4 variáveis do tipo double que serão os
        * valores individuais de x1,y1 e x2,y2. A fim de facilitar
        * na hora do uso da fórmula.
        * E a variável com o resultado*/
        double x1,x2,y1,y2,distancia;
        /*Criando um array separado para pegar os dados do plano1 e plano2*/
        String[] p1,p2;

        /*Lendo os dados do plano 1*/
        line1 = input.nextLine();
        line2 = input.nextLine();

        /*Passando os dados da primeira linha para o plano1*/
        p1 = line1.split(" ");
        /*Passando os dados da segunda linha para o plano2*/
        p2 = line2.split(" ");

        /*Convertendo os valores dos planos em double e atribuindo
        * as suas respectivas variáveis
        * Utilizando da lógica: p1[0] = x1, p1[1] = y1
        * p2[0] = x2, p2[1] = y2*/
        x1 = Double.parseDouble(p1[0]);
        y1 = Double.parseDouble(p1[1]);
        x2 = Double.parseDouble(p2[0]);
        y2 = Double.parseDouble(p2[1]);

        /*Agora vamos utilizar a fórmula para calcular a distância*/
        distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.printf("%.4f%n",distancia);
    }
}
