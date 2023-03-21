import java.util.Scanner;

public class b2921 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        int sum = 0;

        for(int i=0; i<=N; i++) {
            for(int j=i; j<=N; j++) {
                sum = sum + i + j;
            }
        }

        System.out.println(sum);
    }
}
