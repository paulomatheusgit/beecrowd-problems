package beginners;

import java.io.IOException;
import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) throws IOException{
        /*Criando uma variável para leitura de informações*/
        Scanner input = new Scanner(System.in);
        /*Variável para o número do empregado e horas trabalhadas*/
        int employeeNumber, workedHours;
        /*Variável para o valor por hora e para o salário*/
        float amountPerHour,salary;

        /*Capturando os valores do número do empregado, horas
        * trabalhadas e valor por hora*/
        employeeNumber = input.nextInt();
        workedHours = input.nextInt();
        amountPerHour = input.nextFloat();

        /*Fórmula para o salário*/
        salary = workedHours * amountPerHour;

        System.out.println("NUMBER = " + employeeNumber);
        System.out.printf("SALARY = U$ %.2f%n", salary);
    }
}
