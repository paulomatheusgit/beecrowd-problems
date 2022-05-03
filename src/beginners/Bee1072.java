package beginners;

import java.util.Scanner;

public class Bee1072 {
    public static void main(String[] args) {
        int n,qttIn = 0, qttOut = 0;
        int[] x;
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        x = new int[n];
        for(int i = 0; i < x.length; i++){
            x[i] = input.nextInt();
            if((x[i] >= 10) && (x[i] <= 20)){
                qttIn++;
            }else{
                qttOut++;
            }
        }
        System.out.println(qttIn + " in\n"
        + qttOut + " out");
    }
}