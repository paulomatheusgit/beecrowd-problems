package beginners;

import java.util.Scanner;

public class Uri1074 {
    public static void main(String[] args) {
        int n;
        int x[];
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        x = new int[n];

        for(int i = 0; i < x.length; i++){
            x[i] = input.nextInt();            
        }
        for(int i = 0; i < x.length; i++){
            if(x[i] == 0){
                System.out.println("NULL");
            }else if(((x[i] % 2) == 0) && (x[i] > 0)){
                System.out.println("EVEN POSITIVE");
            }else if(((x[i] % 2) == 0) && (x[i] < 0)){
                System.out.println("EVEN NEGATIVE");
            }else{
                if(x[i] > 0){
                    System.out.println("ODD POSITIVE");
                }else{
                    System.out.println("ODD NEGATIVE");
                }
            }
        }
    }
}