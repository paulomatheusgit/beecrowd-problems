package beginners;

import java.math.BigDecimal;

public class Uri1098 {
    public static void main(String[] args) {
        BigDecimal i = new BigDecimal("0"), j, valueI = new BigDecimal("1"), valueII = new BigDecimal("2"), 
        min = new BigDecimal("0"), countI = new BigDecimal("0.2"), countJ = new BigDecimal("1");
        //BigDecimal sum = 0;
        while(i.compareTo(valueII) <= 0){
            j = new BigDecimal("1");
            for(int x = 0; x < 3; x++){
                if((i.compareTo(min) > 0) && (i.compareTo(valueI) < 0)
                || (i.compareTo(valueI) > 0) && (i.compareTo(valueII) < 0)){                
                    System.out.println("I=" + i + " J=" + i.add(j));
                }else{
                    System.out.printf("I=%.0f J=%.0f\n",i,i.add(j));
                }
                j = j.add(countJ);
            }
            i = i.add(countI);
        }
    }
}