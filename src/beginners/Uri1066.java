package beginners;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int evens = 0, odds = 0, positives = 0, negatives = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
            if(numbers[i] % 2 == 0){
                evens++;
            }else{
                odds++;
            }
            if(numbers[i] > 0){
                positives++;
            }else if(numbers[i] < 0){
                negatives++;
            }
        }
        System.out.println(evens + " valor(es) par(es)\n"
        + odds + " valor(es) impar(es)\n"
        + positives + " valor(es) positivo(s)\n"
        + negatives + " valor(es) negativo(s)");
    }
}