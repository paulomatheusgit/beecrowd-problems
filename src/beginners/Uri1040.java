package beginners;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.io.IOException;

public class Uri1040 {
    public static void main(String[] args) throws IOException{
        /*
        * Criando a variável para leitura dos dados
        * */
        Scanner input = new Scanner(System.in);
        /*
        * Criando a variável para recebimento dos dados em uma unica linha
        * */
        String line;
        /*
        * Criando um array para dividir os valores da linha individualmente
        * */
        String[] valores;
        /*
        * Criando uma variável para o resultado dos calculos, uma para um possivel
        * novo valor do exame de "novoExame", e outra pro resultado final
        * */
        BigDecimal resultado, novoExame, resultadoFinal;
        /*
        * Criando um array dos valores convertidos em BigDecimal
        * para facilitar nos calculos
        * */
        BigDecimal[] n;
        /*
        * Lendo os valores em uma linha e atribuindo a variável
        * */
        line = input.nextLine();
        /*
        * Dividindo os valores para serem inseridos individualmente no array
        * */
        valores = line.split(" ");
        /*
        * Inicializando o array 'n' com o tamanho do array 'valores'
        * */
        n = new BigDecimal[valores.length];
        /*
        * Vamos passar os valores em String do array 'valores' para BigDecimal
        * no array 'n'
        * */
        for(int i = 0; i < valores.length; i++){
            n[i] = new BigDecimal(valores[i]);
        }
        /*
        * Aqui é feito calculo da média, de acordo com o enuciado do problema
        * basicamente a formula é: ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10
        * */
        resultado = ((n[0].multiply(BigDecimal.valueOf(2))).add(n[1].multiply(BigDecimal.valueOf(3)))
        .add(n[2].multiply(BigDecimal.valueOf(4))).add(n[3].multiply(BigDecimal.valueOf(1)))).
                divide(BigDecimal.valueOf(10),RoundingMode.DOWN);
        /*
        * Vamos fazer as comparações.
        * Primeiro verifica se é maior ou igual a 7, se for,
        * o aluno está aprovado.
        *
        * Se não, verifica se está entre 5 e 6,9. Se estiver, é solicitado o valor do
        * novo exame do aluno, depois é feito o cálculo da nova média (passando o valor
        * para a variável "resultadoFinal") e é verificado se o resultado final é maior ou
        * igual a 5. Se for, o aluno foi aprovado, se não, reprovado.
        *
        * O último 'senão' é para quando a condicional for direto para um valor
        * no qual não seja nem maior ou igual a 7, nem entre 5 e 6.9
        * que só pode ser valores menores que 5. Sendo assim, o aluno está reprovado
        * direto.
        * */
        if(resultado.compareTo(BigDecimal.valueOf(7)) >= 0){
            System.out.println("Media: " + resultado);
            System.out.println("Aluno aprovado.");
        }else if((resultado.compareTo(BigDecimal.valueOf(5)) >=  0)
                && (resultado.compareTo(BigDecimal.valueOf(6.9)) <= 0)){
            novoExame = input.nextBigDecimal();
            resultadoFinal = (resultado.add(novoExame)).divide(BigDecimal.valueOf(2),RoundingMode.DOWN);
            System.out.println("Media: " + resultado);
            System.out.println("Aluno em exame.");
            System.out.println("Nota do exame: " + novoExame);
            if(resultadoFinal.doubleValue() >= 5){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + resultadoFinal);
        }else{
            System.out.println("Media: " + resultado);
            System.out.println("Aluno reprovado.");
        }
    }
}
