package beginners;

public class Bee1096 {
    public static void main(String[] args) {
        int j; 
        for (int i = 1; i <= 9; i = i + 2){    
            j = 7;                 
            for(int x = 0; x < 3; x++){                
                System.out.println("I=" + i + " J=" + j);
                j--;
            }
        }
    }
}