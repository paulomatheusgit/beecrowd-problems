package beginners;

import java.util.Scanner;
import java.io.IOException;

public class Uri1036 {
    public static void main(String[] args) throws IOException{
        /*
        * Criando as variáveis para leitura dos valores
        * */
        Scanner input = new Scanner(System.in);
        /*
        * Criando as variáveis para atribuição dos valores, a dos resultados, e de
        * manipulações para a fórmula
        * */
        String line;
        String[] valores;
        double x1,x2,divisao,raizQuadrada;
        /*
        * Lendo os valores
        * */
        line = input.nextLine();
        /*
        * Passando os valores da linha individualmente para o array de valores
        */
        /* Valor de A = valores[0]
         * Valor de B = valores[1]
         * Valor de C = valores[2]*/
        valores = line.split(" ");
        /*
        * Vamos fazer alguns calculos necessários para verificar se os valores
        * resultantes estão em conformidade com o pedido do problema
        * OBS: Está sendo feito a conversão de String para Double
        * através do método parseDouble
        * */
        divisao = 2*Double.parseDouble(valores[0]);
        raizQuadrada = Math.pow(Double.parseDouble(valores[1]),2) - (4*Double.parseDouble(valores[0])
                *Double.parseDouble(valores[2]));
        /*
        * Vamos agora fazer a verificação
        * */
        if(divisao == 0 || raizQuadrada < 0){
            System.out.println("Impossivel calcular");
        }else{
            /*
             * Aplicando a fórmula de Bhaskara e imprimindo os valores
             * */
            x1 = (-Double.parseDouble(valores[1]) + (Math.sqrt(raizQuadrada)))/divisao;
            x2 = (-Double.parseDouble(valores[1]) - (Math.sqrt(raizQuadrada)))/divisao;
            System.out.printf("R1 = %.5f%nR2 = %.5f%n",x1,x2);
        }
    }
}
