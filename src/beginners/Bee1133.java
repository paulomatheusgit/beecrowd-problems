package beginners;

import java.util.Scanner;

public class Bee1133 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,z;
        x = Integer.parseInt(input.nextLine());
        y = Integer.parseInt(input.nextLine());
        if(x > y){
            z = x;
            x = y;
            y = z;
        }
        for(int i = x + 1; i < y; i++){
            if(i % 5 == 2 || i % 5 == 3){
                System.out.println(i);
            }
        }
    }
}