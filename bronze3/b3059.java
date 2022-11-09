import java.util.Scanner;

public class b3059 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        for(int i=0; i<T; i++) {
            String S = scan.next();
            System.out.println(S);
            int sum = 0;

            for(int j=65; j<91; j++) {
                if(S.indexOf((char)j) == -1) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }

        scan.close();

        //~ing 
    }
}
