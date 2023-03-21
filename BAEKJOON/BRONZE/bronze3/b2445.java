import java.util.Scanner;

public class b2445 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            for(int k=1; k<=2*(N-i); k++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=N-1; i>=0; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            for(int k=1; k<=2*(N-i); k++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
