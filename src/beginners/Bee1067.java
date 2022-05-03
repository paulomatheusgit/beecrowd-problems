package beginners;

import java.util.Scanner;

public class Bee1067 {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if(number >= 1 && number <= 1000){
            for(int i = 1; i <= number; i++){
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        }
    }
}