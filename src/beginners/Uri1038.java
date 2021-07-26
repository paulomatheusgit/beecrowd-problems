package beginners;

import java.math.BigDecimal;
import java.util.Scanner;
import java.io.IOException;

public class Uri1038 {
    public static void main(String[] args) throws IOException{
        /*
        * Criando a variável para leitura dos valores
        * */
        Scanner input = new Scanner(System.in);
        /*
        * Criando as variáveis para recebimento dos valores
        * */
        String line;
        String[] valores;
        int x;
        BigDecimal y;
        /*
        * Criando array para "códigos" e outro para "preços"
        * */
        int[] codigo = new int[5];
        BigDecimal[] preco = new BigDecimal[5];
        /*
        * Lendo os valores do codigo e quantidade do item
        * em uma unica linha
        * */
        line = input.nextLine();
        /*
        * Passando os valores da linha para um array (individualmente)
        * */
        valores = line.split(" ");
        /*
        * Passando os valores do array acima para variáveis
        * separadas para facilitar o cálculo
        * */
        x = Integer.parseInt(valores[0]);
        y = new BigDecimal(valores[1]);
        /*
        * Populando o array de codigos com os respectivos codigos dado pelo
        * problema (1 a 5).
        * */
        for(int i = 0; i < codigo.length; i++){
            codigo[i] = i;
        }
        /*
        * Vamos popular agora o array dos preços utilizando um for e if's
        * */
        for(int i = 0; i < preco.length; i++){
            if(codigo[i] + 1 == 1){
                preco[i] = new BigDecimal("4.00");
            }else if(codigo[i] + 1 == 2){
                preco[i] = new BigDecimal("4.50");
            }else if(codigo[i] + 1 == 3){
                preco[i] = new BigDecimal("5.00");
            }else if(codigo[i] + 1 == 4){
                preco[i] = new BigDecimal("2.00");
            }else if(codigo[i] + 1 == 5){
                preco[i] = new BigDecimal("1.50");
            }
        }
        /*
        * Fazendo a verificacao do codigo do item pedido
        * e do total do valor dado
        * */
        for(int i = 0; i < codigo.length; i++){
            if(x == (codigo[i] + 1)){
                System.out.printf("Total: R$ %.2f%n",(y.multiply(preco[i])));
            }
        }
    }
}
