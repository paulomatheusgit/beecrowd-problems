package beginners;

import java.util.Scanner;

public class Bee1134 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int alcohol = 0, gasoline = 0, diesel = 0, option = 0;
        while(option != 4){
            option = Integer.parseInt(input.nextLine());
            if(option == 1)
                alcohol++;
            else if(option == 2)
                gasoline++;
            else if(option == 3)
                diesel++;
        }

        System.out.println("MUITO OBRIGADO\nAlcool: " + alcohol +"\nGasolina: "
        + gasoline + "\nDiesel: " + diesel);            
    }
}