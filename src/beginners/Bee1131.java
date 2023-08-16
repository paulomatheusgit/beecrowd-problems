package beginners;

import java.util.ArrayList;
import java.util.Scanner;

public class Bee1131 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line;
        String[] arrLine = new String[2];
        int newGrenal = 1;
        int grenais = 0, inter = 0, gremio = 0, draws = 0;
        ArrayList<Integer> results = new ArrayList<>();
        
        while(newGrenal == 1){            
            line = input.nextLine();
            arrLine = line.split(" ");
            for(int i = 0; i < arrLine.length; i++){
                results.add(Integer.parseInt(arrLine[i]));
            }

            while(true){
                System.out.println("Novo grenal (1-sim 2-nao)");
                newGrenal = Integer.parseInt(input.nextLine());
                if(newGrenal != 1 && newGrenal != 2){
                    continue;
                }else{
                    break;
                }
            }
        }

        grenais = results.size() / 2;
        for(int i = 0; i < results.size(); i++){
            if(i % 2 == 0){
                if(results.get(i) > results.get(i+1)){
                    inter++;
                }else if(results.get(i+1) > results.get(i)){
                    gremio++;
                }else{
                    draws++;
                }
            }
        }
        
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + draws);
        if(inter > gremio){
            System.out.println("Inter venceu mais");
        }else if(gremio > inter){
            System.out.println("Gremio venceu mais");
        }else{
            System.out.println("Não houve vencedor");
        }
    }
}