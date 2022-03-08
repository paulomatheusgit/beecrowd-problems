package beginners;

import java.util.Scanner;

public class Uri1079 {
    public static void main(String[] args) {
        int n;
        String[] line, values = new String[3];
        float[] testCases, floatValues = new float[values.length];
        float r;
        String l;      
        Scanner input = new Scanner(System.in);

        n = Integer.parseInt(input.nextLine());
        line = new String[n];
        testCases = new float[n];

        for(int i = 0; i < n; i++){            
            line[i] = input.nextLine();
            values = line[i].split(" ");
            for(int j = 0; j < values.length; j++){
                floatValues[j] = Float.parseFloat(values[j]);
            }
            //A FORMULA DA MEDIA PONDERADA É A MULTIPLICAÇÃO DE CADA VALOR INSERIDO
            //PELO SEU PESO, E A DIVISÃO PELA SOMA DOS PESOS (2+3+5 = 10)
            testCases[i] = ((floatValues[0] * 2) + (floatValues[1] * 3) +
            (floatValues[2] * 5)) / 10;
        }
        for(int i = 0; i < testCases.length; i++){
            System.out.printf("%.1f\n",testCases[i]);
        }
    }
}