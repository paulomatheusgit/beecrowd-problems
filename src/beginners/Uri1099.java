package beginners;

import java.util.Scanner;

public class Uri1099 {
    public static void main(String[] args) {
        int n;
        try (Scanner input = new Scanner(System.in)) {
            String line[];
            String[] stringResults;
            int[] intResults;
            int x = 0,y = 0;

            n = Integer.parseInt(input.nextLine());
            line = new String[n];
            intResults =  new int[n];
            for(int i = 0; i < line.length; i++){
                line[i] = input.nextLine();
                stringResults = line[i].split(" ");
                x = Integer.parseInt(stringResults[0]);
                y = Integer.parseInt(stringResults[1]);
                if(((x < y) && ((x + 1) == y)) || (x == y) || ((x > y) && ((x - 1) == y))){
                    intResults[i] = 0;
                }else if(x < y){
                    for(int j = x + 1; j < y; j++){
                        if(j % 2 != 0){
                            intResults[i] += j; 
                        }
                    }
                }else{
                    for(int j = y + 1; j < x; j++){
                        if(j % 2 != 0){
                            intResults[i] += j;
                        }
                    }
                }
            }
            for(int i = 0; i < intResults.length; i++){
                System.out.println(intResults[i]);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}