package beginners;

/*ENUNCIADO DO PROBLEMA: [URI1020]
* Leia um valor inteiro correspondente à idade da pessoa (em dias) e imprima em anos, meses e dias, seguido
* da respectiva mensagem “ano (s)”, “mes (s)”, “dia (s)”.
Nota: apenas para facilitar o cálculo, considere o ano com 365 dias e 30 dias a cada mês. Nos casos
*de teste nunca haverá uma situação que permita 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas
* um exercício com o propósito de testar raciocínios matemáticos simples.
* */

import java.util.Scanner;
import java.io.IOException;

public class Bee1020 {
    public static void main(String[] args) throws IOException{
        //Criando a variável para leitura do valor em dias
        Scanner input = new Scanner(System.in);
        //Criando as variáveis para ano, mes e dia
        int ano,mes,dias;

        //Lendo a idade da pessoa em dia(s)
        dias = input.nextInt();

        //Convertendo dias para ano
        ano = dias / 365;
        //O que sobrar, é a quantidade restante de dias
        dias = dias % 365;
        //Convertendo a quantidade atual de dias para mes
        mes = dias / 30;
        //O que sobrar, é a quantidade final de dias
        dias = dias % 30;

        //Imprimindo o resultado de acordo com o pedido do enuciado
        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n",ano,mes,dias);
    }
}
