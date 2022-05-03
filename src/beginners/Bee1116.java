package beginners;

import java.util.Scanner;

public class Bee1116 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,dividend,divisor;
        String[] line;
        String[] arrDiv = new String[2];
        String[] results;
        float r;

        n = Integer.parseInt(input.nextLine());

        line = new String[n];
        results = new String[n];

        for(int i = 0; i < n; i++){
            line[i] = input.nextLine();
        }

        for(int i = 0; i < n; i++){
            arrDiv = line[i].split(" ");

            dividend = Integer.parseInt(arrDiv[0]);
            divisor = Integer.parseInt(arrDiv[1]);

            if(divisor == 0){
                results[i] = "divisao impossivel";
            }else{
                r = (float) dividend / divisor;
                results[i] = String.format("%.1f", r);
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(results[i]);
        }
    }
}