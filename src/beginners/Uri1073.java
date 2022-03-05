package beginners;

import java.util.Scanner;

public class Uri1073{
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        for(int i = 1; i <= number; i++){
            if((i % 2) == 0){
                System.out.println(i + "^2 = " + (int)Math.pow(i, 2));
            }
        }
    }
}