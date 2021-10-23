package beginners;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args){
        /*
        * Criando variável para leitura do salário
        * */
        Scanner input = new Scanner(System.in);
        /*
        * Criando uma variável do tipo 'float' para
        * receber o valor do salário atual, do novo salario,
        * reajuste e percentual
        * */
        float salary,newSalary,readjustment,percentage;
        /*
        * Vamos ler do usuário o valor do seu salário atual
        * */
        salary = input.nextFloat();
        /*
        * Vamos fazer as comparações de acordo com a tabela
        * dada pelo enuciado do problema
        * */
        if((salary >= 0) && (salary <= 400)){
            percentage = 15;
            readjustment = salary * (percentage/100);
            newSalary = salary + readjustment;
        }else if((salary >= 400.01) && (salary <= 800)){
            percentage = 12;
            readjustment = salary * (percentage/100);
            newSalary = salary + readjustment;
        }else if((salary >= 800.01) && (salary <= 1200)){
            percentage = 10;
            readjustment = salary * (percentage/100);
            newSalary = salary + readjustment;
        }else if((salary >= 1200.01) && (salary <= 2000)){
            percentage = 7;
            readjustment = salary * (percentage/100);
            newSalary = salary + readjustment;
        }else{
            percentage = 4;
            readjustment = salary * (percentage/100);
            newSalary = salary + readjustment;
        }
        /*
        * Agora vamos imprimir o resultado
        * */
        System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %.0f %%%n",
                newSalary,readjustment,percentage);
    }
}