package beginners;

/*
* ENUCIADO DO PROBLEMA:
* Leia 3 números duplos (A, B e C) representando os lados de um triângulo e organize-os em ordem decrescente,
* de modo que o lado A seja o maior dos três lados. Em seguida, determine o tipo de triângulo que eles podem
* fazer, com base nos seguintes casos, sempre escrevendo uma mensagem apropriada:
* se A ≥ B + C, escreva a mensagem: NAO FORMA TRIANGULO
* se A2 = B2 + C2, escreva a mensagem: TRIANGULO RETANGULO
* se A2> B2 + C2, escreva a mensagem: TRIANGULO OBTUSANGULO
* se A2 <B2 + C2, escreva a mensagem: TRIANGULO ACUTANGULO
* se os três lados forem do mesmo tamanho, escreva a mensagem: TRIANGULO EQUILATERO
* se apenas dois lados são iguais e o terceiro é diferente, escreva a mensagem: TRIANGULO ISOSCELES
* */

import java.util.Scanner;
import java.io.IOException;

public class Bee1045 {
    public static void main(String[] args) throws IOException{
        /*
        * Criando variável para leitura dos dados
        * */
        Scanner input = new Scanner(System.in);
        /*
        * Criando String que vai ler a linha dos dados;
        * Um array de String que vai receber os dados
        * individualmente;
        * Um array do tipo double para receber os valores
        * em Double;
        * Um array do tipo boolean para receber valores
        * booleanos e depois verificar o tipo de triangulo;
        * Variáveis do tipo double para realizar os cálculos;
        * */
        String line;
        String[] arrayLine;
        double[] doubleArrayLine;
        boolean[] triangulo = new boolean[6];
        double a,b,c,maior;
        /*
        * Lendo os valores pelo usuário
        * */
        line = input.nextLine();
        /*
        * Passando os valores individualmente para o array
        * */
        arrayLine = line.split(" ");
        /*
        * Inicializando o array do tipo Double com o tamanho
        * que tiver o arrayLine
        * */
        doubleArrayLine = new double[arrayLine.length];
        /*
        * Passando os valores do arrayLine (String) para
        * o doubleArrayLine (double)
        * */
        for(int i = 0; i < doubleArrayLine.length; i++){
            doubleArrayLine[i] = Double.parseDouble(arrayLine[i]);
        }
        /*
        * Passando os valores para as variaveis;
        * */
        a = doubleArrayLine[0];
        b = doubleArrayLine[1];
        c = doubleArrayLine[2];
        /*
        * Verificando se B é o maior valor, e colocando em
        * primeiro, se não, verifica se C é o maior valor
        * e colocando em primeiro caso seja.
        * */
        if(b >= a && b >= c){
            maior = b;
            b = a;
            a = maior;
        }else if(c >= a && c >= b){
            maior = c;
            c = a;
            a = maior;
        }
        /*
        * Criando a variavel 'v' contendo a expressao:
        * b² + c² (essa expressão vai ser utilizada
        * repetida vezes, e com a variavel melhora
        * a legibilidade.
        * */
        double v = Math.pow(b, 2) + Math.pow(c, 2);
        /*
        * Atribuindo ao array "triangulo" os valores das
        * expressoes passadas pelo problema. (as expressões
        * estão seguindo a ordem que foi colocada no enuciado
        * do problema, são 6 expressões citadas)
        * */
        triangulo[0] = (a >= b + c);
        triangulo[1] = (Math.pow(a,2) == v);
        triangulo[2] = (Math.pow(a,2) > v);
        triangulo[3] = (Math.pow(a,2) < v);
        triangulo[4] = ((a == b) && (b == c));
        triangulo[5] = ((a == b && b != c) || (a != b && b == c) || (a == c && c != b));
        /*
        * Verificando um a um no array triangulo se existe
        * algum "true", caso exista é verificado o índice
        * desse "true" e de acordo com o indice é feito a
        * impressão do resultado correspondente. O unico "if"
        * que tem o "break" é o do indice 0 (nao forma
        * triangulo) pois esse não tem como ser impresso com
        * algum outro resultado (se nao forma um triangulo,
        * nao tem necessidade de verificar os outros)
        * */
        for(int i = 0; i < triangulo.length; i++){
            if(triangulo[i]){
                if(i == 0){
                    System.out.println("NAO FORMA TRIANGULO");
                    break;
                }else if(i == 1){
                    System.out.println("TRIANGULO RETANGULO");
                }else if(i == 2){
                    System.out.println("TRIANGULO OBTUSANGULO");
                }else if(i == 3){
                    System.out.println("TRIANGULO ACUTANGULO");
                }else if(i == 4){
                    System.out.println("TRIANGULO EQUILATERO");
                }else{
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
        }
    }
}
