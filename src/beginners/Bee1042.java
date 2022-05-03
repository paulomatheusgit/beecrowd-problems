package beginners;

/* ENUCIANDO DO PROBLEMA [URI1042]:
* Leia três inteiros e classifique-os em ordem crescente. Em seguida, imprima
* esses valores em ordem crescente, uma linha em branco e em seguida os valores na
* seqüência conforme foram lidos.
* */

import java.util.Scanner;
import java.io.IOException;

public class Bee1042 {
    public static void main(String[] args) throws IOException{
        /*
        * Criando a variável para leitura dos dados
        * */
        Scanner input = new Scanner(System.in);
        /*
        * Criando a String para leitura da linha com os dados, e array
        * para receber os dados individualizados
        * */
        String line;
        String[] valores;
        /*
        * Criando as variáveis 'int' para facilitar na manipulação
        * individual dos valores
        * */
        int a,b,c;
        /*
        * Lendo os valores
        * */
        line = input.nextLine();
        /*
        * Passando os valores para o Array
        * */
        valores = line.split(" ");
        /*
         * Criando um array de inteiros para receber os valores em ordem crescente
         * */
        int[] crescentes = new int[valores.length];
        /*
        * Passando os valores do array para uma variável individual
        * já convertidos
        * */
        a = Integer.parseInt(valores[0]);
        b = Integer.parseInt(valores[1]);
        c = Integer.parseInt(valores[2]);
        /*
        * Realizando as comparações de valores utilizando o IF.
        * Os IF's seguem uma lógica: Se há três números na entrada,
        * chamados de A B C, então há 6 possibilidades de entradas:
        * A B C, A C B, B A C, B C A, C A B, C B A
        * Então, os IF's irão verificar todas essa possibilidades, nessa mesma
        * ordem supracitadas para colocá-los em ordem crescente.
        * Detalhe para último ELSE no final, que não tem uma expressão condicional
        * (tem apenas o ELSE) pois a única possibilidade que sobra para verificação
        * é a C B A, então seria redundante colocar.
        * */
        if(((a < b) && (a < c)) && (b < c)){
            crescentes[0] = a;
            crescentes[1] = b;
            crescentes[2] = c;
        }else if(((a < c) && (a < b)) && (c < b)){
            crescentes[0] = a;
            crescentes[1] = c;
            crescentes[2] = b;
        }else if(((b < a) && (b < c)) && (a < c)){
            crescentes[0] = b;
            crescentes[1] = a;
            crescentes[2] = c;
        }else if(((b < c) && (b < a)) && (c < a)){
            crescentes[0] = b;
            crescentes[1] = c;
            crescentes[2] = a;
        }else if(((c < a) && (c < b)) && (a < b)){
            crescentes[0] = c;
            crescentes[1] = a;
            crescentes[2] = b;
        }else{
            crescentes[0] = c;
            crescentes[1] = b;
            crescentes[2] = a;
        }
        /*
        * Imprimindo os valores em ordem crescente, colocando uma linha
        * depois, e imprimindo os valores na ordem inserida
        * */
        for (int crescente : crescentes) {
            System.out.println(crescente);
        }
        System.out.println();
        for (String valor : valores) {
            System.out.println(valor);
        }
    }
}
