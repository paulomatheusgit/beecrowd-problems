package beginners;

import java.util.ArrayList;
import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<String> log = new ArrayList<>();
            int password;
            boolean okYouCanAcess = false;
            while(!okYouCanAcess){
                password = input.nextInt();
                if(password == 2002){
                    log.add("Acesso Permitido");
                    okYouCanAcess = true;
                }else{
                    log.add("Senha Invalida");
                }
            }
            for(int i = 0; i < log.size(); i++){
                System.out.println(log.get(i));
            }
        }
    }
}