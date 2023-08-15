package beginners;

import java.util.Scanner;

public class Bee1118 {

    static Scanner input = new Scanner(System.in);
    static float averageScore;
    static float score1, score2;
    static int novoCalculo;

    public static void main(String[] args) {        
        novoCalculo = 1;
        while(novoCalculo == 1){
            averageScore = 0;        
            while(true){
                score1 = input.nextFloat();
                if(score1 < 0 || score1 > 10){
                    System.out.println("nota invalida");
                    continue;
                }else{
                    averageScore += score1;
                    break;
                }
            }            

            while(true){
                score2 = input.nextFloat();
                if(score2 < 0 || score2 > 10){
                    System.out.println("nota invalida");
                    continue;
                }else{
                    averageScore += score2;
                    break;
                }
            }

            System.out.printf("media = %.2f\n", averageScore/2);
            
            while(true){
                System.out.println("novo calculo (1-sim 2-nao)");
                novoCalculo = input.nextInt();
                if(novoCalculo != 1 && novoCalculo != 2){
                    continue;
                }
                else{
                    break;
                }
            }           
        }
    }
}