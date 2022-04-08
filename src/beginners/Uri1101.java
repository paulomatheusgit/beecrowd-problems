package beginners;

import java.util.ArrayList;
import java.util.Scanner;

public class Uri1101 {
    public static void main(String[] args) {
        boolean stop = false;
        String line;
        String resultLine;
        int m,n,results;
        String[] stringLine = new String[2];

        try (Scanner input = new Scanner(System.in)) {
            ArrayList<String> aList = new ArrayList<>();
            while(!stop){
                resultLine = "";
                results = 0;
                line = input.nextLine();
                stringLine = line.split(" ");

                m = Integer.parseInt(stringLine[0]);
                n = Integer.parseInt(stringLine[1]);
                
                if(m <= 0 || n <= 0){
                    stop = true;
                }else{
                    if(n > m){
                        for(int i = m; i <= n; i++){
                            results += i;
                            resultLine += i + " ";
                        }
                    }else{
                        for(int i = n; i <= m; i++){
                            results += i;
                            resultLine += i + " ";
                        }
                    }
                    resultLine += "Sum="+results;
                    aList.add(resultLine);
                }
            }
            for(int i = 0; i < aList.size(); i++){
                System.out.println(aList.get(i));
            }
        } catch (NumberFormatException e) {
            e.getMessage();
        }
    }
}
