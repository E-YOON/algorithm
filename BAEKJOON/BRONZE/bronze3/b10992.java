// 별 찍기 - 17

import java.util.Scanner;

public class b10992 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for(int i=1; i<=N; i++) {
            if(i == N) {
                for(int j=1; j<=2*i-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for(int j=1; j<=N-i; j++) {
                    System.out.print(" ");
                }
    
                for(int j=1; j<=2*i-1; j++) {
                    if(j == 1 || j == 2*i-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
