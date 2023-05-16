// 별 찍기 - 20

import java.util.Scanner;

public class b10995 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for(int i=1; i<=N; i++) {
            if(i % 2 == 0) {
                System.out.print(" ");
            } 

            for(int j=1; j<=N; j++) {
                System.out.print("*");
                if(j == N) {
                    System.out.println();
                    break;
                }
                System.out.print(" ");
            }
        }
    }
}
