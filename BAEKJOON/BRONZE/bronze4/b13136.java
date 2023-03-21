import java.util.Scanner;

public class b13136 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();
        int C = scan.nextInt();
        int N = scan.nextInt();
        scan.close();

        long x, y;

        if(R%N != 0) 
            x = R/N + 1;
        else
            x = R/N;
        
        if(C%N != 0)
            y = C/N + 1;
        else
            y = C/N;
        
            System.out.println(x*y);
    }
}
