
import java.util.Scanner;

public class b6378 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            String N = scan.next();
            if(N.equals("0")) break;

            while(true) {
                int sum = 0;

                if(N.length() < 2) {
                    break;
                } else {
                    for(int i=0; i<N.length(); i++) {
                        sum += N.charAt(i)-'0';
                    }
                }

                N = String.valueOf(sum);
            }

            System.out.println(N);
        }
        scan.close();
    }

}
