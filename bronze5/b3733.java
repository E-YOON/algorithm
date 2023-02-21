package bronze5;

import java.util.Scanner;

public class b3733 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, S;
        while(scan.hasNext()) {
            N = scan.nextInt();
            S = scan.nextInt();
            System.out.println(S/(N+1));
        }
        scan.close();
    }
}
