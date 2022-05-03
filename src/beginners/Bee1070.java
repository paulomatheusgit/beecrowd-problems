package beginners;

import java.util.Scanner;

public class Bee1070 {
    public static void main(String[] args) {
        int number,qttOdd = 0;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        while(qttOdd < 6){
            if ((number % 2) != 0){
                qttOdd++;
                System.out.println(number);
            }            
            number++;
        }
    }
}