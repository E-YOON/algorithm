import java.util.Scanner;

public class b2523 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for(int i=1; i<=N; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=1; i<=N-1; i++) {
            for(int j=0; j<N-i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
