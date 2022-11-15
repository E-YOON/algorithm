import java.util.Scanner;

public class b4892 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 1;
        while(true) {
            int n0 = scan.nextInt();
            int n1, n3, n4;
            if(n0 == 0) break;

            n1 = 3*n0;
            if(n1%2 == 0) {
                n3 = n1/2*3;
                n4 = n3/9;
                System.out.printf("%d. even %d\n", cnt, n4);

            } else {
                n3 = (n1+1)/2*3;
                n4 = n3/9;
                System.out.printf("%d. odd %d\n", cnt, n4);
            }
            cnt++;
        }
        scan.close();
    }
}
