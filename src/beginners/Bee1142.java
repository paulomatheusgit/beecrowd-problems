package beginners;

import java.util.Scanner;

public class Bee1142 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,line = 1;
        String sLine;

        n = Integer.parseInt(input.nextLine());
        for(int i = 1; i <= n; i++){
            sLine = "";
            for(int j = line; j <= line + 3; j++){
                if(j % 4 != 0){
                    sLine += j + " ";
                }else{
                    sLine += "PUM\n";
                }
            }
            line += 4;
            System.out.print(sLine);
        }
    }
}