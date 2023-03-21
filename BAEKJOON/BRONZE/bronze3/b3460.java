import java.util.Scanner;

public class b3460 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i=0; i<T; i++) {
            int n = scan.nextInt();
            int idx = 0;

            while(n != 0) {
                if(n%2 == 1) {
                    System.out.print(idx + " ");
                }
                n = n/2;
                idx++;
            }
            System.out.println();
        }
        scan.close();
    }
}
