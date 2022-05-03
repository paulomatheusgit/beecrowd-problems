package beginners;
/*
* ENUCIADO DO PROBLEMA:
* Leia um número inteiro que é o número do código para
* discagem telefônica. Em seguida, imprima o destino de
* acordo com a tabela
* */
import java.util.Scanner;

public class Bee1050 {
    public static void main(String[] args) {
        /*
        * Criando uma variável para leitura dos dados
        * */
        Scanner input = new Scanner(System.in);
        /*
        * Criando uma variável do tipo inteiro para receber
        * o valor do DDD do usuário
        * */
        int ddd;
        /*
        * Fazendo a leitura do ddd
        * */
        ddd = input.nextInt();
        /*
        * Vamos fazer a verificação do DDD de acordo com a tabela
        * fornecida pelo problema
        * */
        if(ddd == 61){
            System.out.println("Brasilia");
        }else if(ddd == 71){
            System.out.println("Salvador");
        }else if(ddd == 11){
            System.out.println("Sao Paulo");
        }else if(ddd == 21){
            System.out.println("Rio de Janeiro");
        }else if(ddd == 32){
            System.out.println("Juiz de Fora");
        }else if(ddd == 19){
            System.out.println("Campinas");
        }else if(ddd == 27){
            System.out.println("Vitoria");
        }else if(ddd == 31){
            System.out.println("Belo Horizonte");
        }else{
            System.out.println("DDD nao cadastrado");
        }
    }
}
