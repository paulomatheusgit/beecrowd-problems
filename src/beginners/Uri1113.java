package beginners;

import java.util.ArrayList;
import java.util.Scanner;

public class Uri1113 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String line;
            ArrayList<String> arrLine = new ArrayList<>();
            String[] sLine = new String[2];
            int x,y;
            boolean isEqual = false;

            do{
                line = input.nextLine();
                sLine = line.split(" ");
                x = Integer.parseInt(sLine[0]);
                y = Integer.parseInt(sLine[1]);

                if(x == y){
                    isEqual = true;
                }else{
                    if(x > y){
                        arrLine.add("Decrescente");
                    }else{
                        arrLine.add("Crescente");
                    }
                }
            }while(!isEqual);

            for(int i = 0; i < arrLine.size(); i++){
                System.out.println(arrLine.get(i));                
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}