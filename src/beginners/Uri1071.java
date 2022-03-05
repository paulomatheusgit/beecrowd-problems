package beginners;

import java.util.Scanner;

public class Uri1071 {
    public static void main(String[] args) {
        int x,y,odds = 0;
        Scanner input = new Scanner (System.in);
        x = input.nextInt();
        y = input.nextInt();

        //CASO SEJAM NUMEROS IGUAIS
        if(x == y){
            System.out.println("0");
        }
        //CASO O PRIMEIRO NUMERO SEJA MAIOR QUE O SEGUNDO
        else if(x > y){
            for(int i = x-1; i > y; i--){
                if((i % 2) != 0){
                    odds += i;
                }
            }
            System.out.println(odds);
        }
        //CASO O SEGUNDO NUMERO SEJA MAIOR QUE O PRIMEIRO
        else{
            for(int i = x+1; i < y; i++){
                if((i % 2) != 0){
                    odds += i;
                }
            }
            System.out.println(odds);
        }        
    }
}