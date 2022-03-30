package beginners;

public class Uri1097 {
    public static void main(String[] args) {
        int i = 1, j = 7;
        while(i <= 9){
            for(int x = 0; x < 3; x++){
                System.out.println("I=" + i + " J=" + j);
                j--;
            }
            j = j + 5;
            i = i + 2;
        }
    }
}