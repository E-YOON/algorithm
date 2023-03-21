import java.util.Scanner;

public class b2903 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        int x = 2;

        for(int i=0; i<N; i++) {
            x += x-1;
        }

        System.out.println(x*x);
    }
}
