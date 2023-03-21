import java.util.Scanner;

public class b10156 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int N = scan.nextInt();
        int M = scan.nextInt();
        scan.close();

        if(K*N < M) {
            System.out.println("0");
        } else {
            System.out.println(K*N - M);
        }
    }
}
