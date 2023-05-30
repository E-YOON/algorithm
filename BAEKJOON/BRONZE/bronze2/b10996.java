// 별 찍기 - 21

import java.util.Scanner;

public class b10996 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for(int i=1; i<=N*2; i++) {
            if(i%2 != 0) {
                for(int j=1; j<=N; j++) {
                    if(j%2 != 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            } else {
                for(int j=1; j<=N; j++) {
                    if(j%2 != 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
