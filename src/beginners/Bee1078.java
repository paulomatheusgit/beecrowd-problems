package beginners;

import java.util.Scanner;

public class Bee1078 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(i + " x " + n + " = " + (i*n));
        }
    }
}