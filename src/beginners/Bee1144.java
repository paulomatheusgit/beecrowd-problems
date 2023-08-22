package beginners;

import java.util.Scanner;

public class Bee1144 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,second,third;
        String line;
        n = Integer.parseInt(input.nextLine());
        if(n > 1 && n < 1000){
            for(int i = 1; i <= n; i++){
                line = "";
                line += i + " " + (i*i) + " " + ((i*i)*i);
                System.out.println(line);

                line = "";
                line += i + " " + ((i*i)+ 1) + " " + (((i*i)*i)+ 1);
                System.out.println(line);
            }
        }
    }
}