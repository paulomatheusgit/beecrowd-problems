package beginners;

import java.util.ArrayList;
import java.util.Scanner;

public class Bee1117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            float score;
            float a,b;
            float[] validScores = new float[2];
            ArrayList<String> informations = new ArrayList<>();
            int i = 0;

            while(i <= 1){
                score = input.nextFloat();
                if(isValid(score)){
                    validScores[i] = score;
                    i++;
                }else{
                    informations.add("nota invalida");                    
                }
            }
            
            a = validScores[0];
            b = validScores[1];

            informations.add(String.format("media = %.2f", (a+b)/2));

            for(int j = 0; j < informations.size(); j++){
                System.out.println(informations.get(j));
            }
    }
    public static boolean isValid(float value){
        if(value < 0 || value > 10){
            return false;
        }else{
            return true;
        }
    }
}