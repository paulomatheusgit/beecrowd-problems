package beginners;

import java.util.Scanner;

public class Bee1065 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int evens = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
            if(numbers[i] % 2 == 0){
                evens++;
            }
        }
        System.out.println(evens + " valores pares");
    }
}