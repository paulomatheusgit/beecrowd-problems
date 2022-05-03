package beginners;

import java.util.Scanner;
import java.io.IOException;

public class Bee1017 {
    public static void main(String[] args) throws IOException{
        /*Criando a variável de leitura das informações*/
        Scanner input = new Scanner(System.in);
        /*Criando as variáveis para recebimento das informações
        * e do resultado*/
        int tempo,vMedia,distancia;
        float qtdCombustivel;

        /*Pegando as informações e atribuindo as variáveis*/
        tempo = input.nextInt();
        vMedia = input.nextInt();

        /*Calculando a distancia percorrida*/
        distancia = tempo * vMedia;

        /*Agora vamos calcular o quanto de combustível
        * foi gasto*/
        /*OBS: É necessário dizer ao JAVA que queremos o resultado
        * em float pois se trata de dois inteiros. Em uma operação
        * entre dois inteiros, o JAVA vai deduzir por conta própria
        * que o resultado seria inteiro*/
        qtdCombustivel = (float) distancia / 12;

        System.out.printf("%.3f%n",qtdCombustivel);
    }
}
