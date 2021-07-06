package beginners;

import java.io.IOException;
import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) throws IOException{
        /*Criando uma variável para leitura de informações*/
        Scanner input = new Scanner(System.in);

        /*Variável para o nome*/
        String name;
        /*Variável para salário, vendas totais e resultado*/
        double salary,totalSales,result;

        /*Capturando as informações (Nome por ser String
        é utilizado o nexLine())*/
        name = input.nextLine();
        salary = input.nextFloat();
        totalSales = input.nextFloat();

        /*Fórmula para o resultado*/
        result = salary + (totalSales * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n",result);
    }
}
