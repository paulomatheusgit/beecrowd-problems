package beginners;

import java.util.Scanner;

public class Bee1132 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,z,sum = 0;
        x = Integer.parseInt(input.nextLine());
        y = Integer.parseInt(input.nextLine());
        
        if(x > y){
            z = x;
            x = y;
            y = z;
        }

        for(int i = x; i <= y; i++){
            if(i % 13 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}