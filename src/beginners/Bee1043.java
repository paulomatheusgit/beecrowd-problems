package beginners;

/*
* Leia os valores flutuantes de três pontos (A, B e C) e verifique se é
* possível fazer um triângulo com eles. Se for possível, calcule o perímetro
* do triângulo e imprima a mensagem:
Perimetro = XX.X

* Se não for possível, calcule a área do trapézio que tem como base A e B e C a
* altura, e imprima a mensagem:
* Área = XX.X
* */

import java.util.Scanner;
import java.io.IOException;

public class Bee1043 {
    public static void main(String[] args) throws IOException{
        /*
        * Criando a variável de leitura dos dados
        * */
        Scanner input = new Scanner(System.in);
        /*
        * Criando a variável que será utilizada para leitura e
        * as que serão utilizadas para manipulação e impressão
        * dos dados
        * */
        String valores;
        String[] arrayValores;
        float[] fValores;
        float[] menores;
        float maior;
        float somaDosMenores = 0;
        float perimetro;
        float area;
        boolean triangulo;
        /*
        * A variável index será utilizada para guardar em qual index (indice)
        * do array fValores estará o maior valor
        * */
        int index;
        /*
        * Lendo os valores através da variável valores
        * */
        valores = input.nextLine();
        /*
        * Atribuindo ao array "arrayValores" os valores individualmente
        * */
        arrayValores = valores.split(" ");
        /*
        * Atribuindo o tamanho do array fValores o valor do tamanho
        * do "arrayValores" de acordo com o tanto de informações
        * que foi passado pelo usuário.
        * */
        fValores = new float[arrayValores.length];
        /*
        * Sabendo que utilizaremos no array "menores" apenas
        * os números que sobrarem além do "maior" número, então
        * nosso array "menores" terá o tamanho de fValores - 1.
        * */
        menores = new float[fValores.length - 1];
        /*
        * Passando os valores que estão em String para Float, e
        * atribuindo um a um para fValores.
        * */
        for(int i = 0; i < fValores.length; i++){
            fValores[i] = Float.parseFloat(arrayValores[i]);
        }
        /*
        * Nosso primeiro indice logicamente é 0. Sabendo que temos que
        * possuir um valor inicial para realizar as comparações, vamos
        * atribuir o valor do primeiro indice (index) a variavel "maior"
        * e posteriormente realizar as comparações com os outros indices.
        * */
        maior = fValores[0];
        index = 0;
        /*
        * Agora que ja sabemos o valor do index 0, vamos iniciar então
        * o For com valor 1, e realizar as comparações, se "maior" for
        * menor que o valor do indice atual de fValores, entao esse valor
        * atual vai ser o novo da variavel "maior". Atualizando também
        * o valor de index
        * */
        for(int i = 1; i < fValores.length; i++){
            if(maior < fValores[i]){
                maior = fValores[i];
                index = i;
            }
        }
        /*
        * Agora é hora de atribuirmos ao array "menores" os outros
        * valores com excessão do valor do indice que se tornou o
        * maior. Para isso se o indice tiver sido o ultimo (primeiro if)
        * entao apenas passamos todos os valores normalmente de "fValores"
        * para "menores". Se não (else if), caso o indice tenha sido o primeiro
        * (indice 0) então os valores passados para o array "menores" será o
        * indice de fValores -1 (pois o array "menores" tem seu tamanho "-1"
        * comparado ao fValores). E por ultimo (else) se o valor nao estiver
        * nas pontas (nem primeiro nem ultimo) até chegar ao index (menor que index)
        * os valores sao passados normalmente, e depois que passam do index
        * (maior que index) os valores sao passados subtraindo -1 do indice de fValores
        * */
        if(index == menores.length){
            for(int i = 0; i < index; i++){
                menores[i] = fValores[i];
            }
        }else if(index == 0){
            for(int i = 1; i <= menores.length; i++){
                for(int j = i - 1; j < menores.length; j++){
                    menores[j] = fValores[i];
                }
            }
        }else{
            for(int i = 0; i <= menores.length; i++){
                if(i < index){
                    menores[i] = fValores[i];
                }else if(i > index){
                    menores[i - 1] = fValores[i];
                }
            }
        }
        /*
        * Aqui é realizado a soma de todos os valores do array "menores"
        * */
        for(int i = 0; i < menores.length; i++){
            somaDosMenores += menores[i];
        }
        /*
        * Utilizando a regra de coexistencia de um triangulo, se o maior
        * valor for menor que a soma dos outros dois, então é um triangulo.
        * Se não, não é um triangulo.
        * */
        triangulo = maior < somaDosMenores;
        /*
        * Condição para impressão dos resultados caso seja um triangulo
        * utiliza a formula de perimetro de um triangulo, caso não, utiliza
        * a regra da area de um trapezio.
        * */
        if(triangulo){
            perimetro = fValores[0] + fValores[1] + fValores[2];
            System.out.printf("Perimetro = %.1f%n",perimetro);
        }else{
            area = ((fValores[0] + fValores[1]) * fValores[2])/2;
            System.out.printf("Area = %.1f%n",area);
        }

    }
}
