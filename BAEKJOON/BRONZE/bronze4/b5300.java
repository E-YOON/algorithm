import java.util.Scanner;

public class b5300 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for(int i=1; i<=N; i++) {
            System.out.print(i + " ");

            if(i % 6 == 0) {
                System.out.print("Go! ");
            } else if(i == N) {
                System.out.print("Go!");
            }
        }
    }
}
