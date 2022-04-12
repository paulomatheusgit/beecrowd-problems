package beginners;

import java.util.ArrayList;
import java.util.Scanner;

public class Uri1115 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<String> quadrants = new ArrayList<>();
            boolean stop = false;
            String line;
            String[] arrLine = new String[2];
            int x, y;
            do{
                line = input.nextLine();
                arrLine = line.split(" ");

                x = Integer.parseInt(arrLine[0]);
                y = Integer.parseInt(arrLine[1]);

                if(x > 0 && y > 0){
                    quadrants.add("primeiro");
                }else if(x < 0 && y > 0){
                    quadrants.add("segundo");
                }else if(x < 0 && y < 0){
                    quadrants.add("terceiro");
                }else if(x > 0 && y < 0){
                    quadrants.add("quarto");
                }else{
                    stop = true;
                }
            }while(!stop);
            for(int i = 0; i < quadrants.size(); i++){
                System.out.println(quadrants.get(i));
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}