import java.util.Scanner;

public class b2443 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for(int i=N-1; i>=0; i--) {
            for(int j=1; j<N-i; j++) {
                System.out.print(" ");
            }

            for(int k=1; k<=2*i+1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
