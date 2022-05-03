package beginners;

import java.util.Scanner;

public class Bee1060 {
    public static void main(String[] args) {
        float[] numbers = new float[6];
        int qtdPositives = 0;
        try (Scanner input = new Scanner(System.in)) {
            for(int i = 0; i < numbers.length; i++){
                numbers[i] = input.nextFloat();
            }
        }
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 0){
                qtdPositives++;
            }
        }
        System.out.println(qtdPositives + " valores positivos");
    }
}