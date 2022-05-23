package beginners;
/*

*/
import java.util.Scanner;

public class Bee1010 {
    public static void main(String[] args) throws Exception{

        try (/*Criando a variável para leitura das informações*/
        Scanner input = new Scanner(System.in)) {
            /*Criando um array de Strings receber as entradas*/
            String[] line = new String[2];

            /*Criando um Array de String para cada produto individualmente*/
            String[] product1, product2;

            /*Variável que vai conter o valor total a pagar*/
            float value;

            /*Os valores FLOAT (terceiro valor) devem ser
             * inseridos com ponto (.) e não vírgula.
             * Exemplo: 5.20 ao invés de 5,20*/
            /*Esse loop vai popular cada índice do Array com as informações
            de cada linha*/
            for(int i = 0; i < line.length; i++){
                line[i] = input.nextLine();
            }
            /*As informações populadas agora são separadas (através do método
            split) e inseridas uma a uma em um array individual de cada produto*/
            product1 = line[0].split(" ");
            product2 = line[1].split(" ");

            /*Os últimos valores (índices [2] de cada array de produto)
            * e os segundos valores (índices [1] de cada array de produto)
            * correspondem ao preço e quantidade do produto, respectivamente.
            * Logo, os mesmos são convertidos em float e é feito o cálculo
            * através da fórmula
            * valor = (preçoProduto1 * qtdProduto1)+(preçoProduto2 * qtdProduto2)
            * */
            value = (Float.parseFloat(product1[2]) * Float.parseFloat(product1[1])) +
                    (Float.parseFloat(product2[2]) * Float.parseFloat(product2[1]));

            System.out.printf("VALOR A PAGAR: R$ %.2f%n",value);
        }
    }
}
