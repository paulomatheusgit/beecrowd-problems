package beginners;

import java.util.Scanner;

public class Bee1051 {
    public static void main(String[] args) throws Exception {
        //Criando a variável para o salário do habitante e o resto
        double salary, remainder;
        try (//Criando a variável para a leitura dos dados
        Scanner input = new Scanner(System.in)) {
            //Lendo o salário do habitante
            salary = input.nextDouble();
        }
        //Comparando o valor do salario para aplicar a % do imposto correspondente
        if(salary > 4500.00){
            //primeita porcentagem sempre vai ser R$ 80
            //segunda porcentagem sempre vai ser R$ 270
            remainder = (salary - 4500.00) * 0.28;
            System.out.printf("R$ %.2f\n",remainder + 80 + 270);
        }else if(salary <= 4500.00 && salary > 3000.00){
            //primeira porcentagem sempre vai ser R$ 80
            remainder = (salary - 3000.00) * 0.18;
            System.out.printf("R$ %.2f\n",remainder + 80);
        }else if(salary <= 3000.00 && salary > 2000.00){
            remainder = (salary - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n",remainder);
        }else{
            System.out.println("Isento");
        }
    }
}