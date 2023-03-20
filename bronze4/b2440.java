import java.util.Scanner;

public class b2440 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for(int i=0; i<N; i++) {
            for(int j=0; j<N-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
