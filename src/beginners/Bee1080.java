package beginners;

import java.util.Scanner;

public class Bee1080 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int highest = 0, position = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
            if(numbers[i] > highest){
                highest = numbers[i];
                position = i + 1;
            }
        }
        System.out.println(highest + "\n" + position);
    }
}