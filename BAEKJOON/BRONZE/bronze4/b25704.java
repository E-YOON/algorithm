import java.util.Scanner;

public class b25704 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int P = scan.nextInt();
        scan.close();
        int discount = 0;

        
        if(N >= 5) {
            if(N >= 20) N = 20;
            N /= 5;
            switch (N) {
                case 4: discount = Math.max(discount, (int)(P*0.25));
    
                case 3: discount = Math.max(discount, 2000);
    
                case 2: discount = Math.max(discount, (int)(P*0.1));
    
                case 1: discount = Math.max(discount, 500);
                    break;
            }
        }
        

        System.out.println(discount >= P ? 0 : P-discount);
    }
}
