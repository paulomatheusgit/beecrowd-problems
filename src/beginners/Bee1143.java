package beginners;

import java.util.Scanner;

public class Bee1143 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,first,second;
        String line;
        n = Integer.parseInt(input.nextLine());
        if(n > 1 && n < 1000){
            for(int i = 1; i <= n; i++){
                line = "";
                first = i * i;
                second = first * i;
                line += i + " " + first + " " + second;
                System.out.println(line);
            }
        }
    }
}