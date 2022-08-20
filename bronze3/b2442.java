import java.util.Scanner;

public class b2442 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for(int i=1; i<=N; i++) {           
            for(int j=1; j<=N-i; j++) {
                System.out.print(" ");
            }

            for(int k=1; k<=2*i-1; k++) {    
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
