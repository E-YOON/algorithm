import java.util.Scanner;

public class b2522 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for(int i=1; i<=N; i++) {
            for(int j=0; j<N-i; j++) {
                System.out.print(" ");
            }
            
            for(int k=0; k<i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=N-1; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }

            for(int k=0; k<N-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
