package beginners;

import java.util.Scanner;

public class Bee1145 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        String inputLine,resultLine;
        String[] values;

        inputLine = input.nextLine();
        values = inputLine.split(" ");

        x = Integer.parseInt(values[0]);
        y = Integer.parseInt(values[1]);

        if(x > 1 && x < 20){         
            if(y > x && y < 100000){
                for(int i = 1; i <= y; i++){
                    resultLine = "";
                    if(i % x == 0 || i == y){
                        resultLine += i + "\n";
                    }else{
                        resultLine += i + " ";
                    }
                    System.out.print(resultLine);
                }
            }
        }
    }
}