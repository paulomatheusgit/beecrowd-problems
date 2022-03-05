package beginners;

import java.util.Scanner;

public class Uri1064{
    public static void main(String[] args) {
        float[] numbers = new float[6];
        float average = 0;
        int qtdPositives = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextFloat();
            if(numbers[i] > 0){
                qtdPositives++;
                average += numbers[i];
            }
        }
        System.out.printf("%d valores positivos\n%.1f\n",qtdPositives,(average/qtdPositives));
    }
}