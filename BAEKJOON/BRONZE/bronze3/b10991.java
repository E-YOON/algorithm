// 별 찍기 - 16

import java.util.Scanner;

public class b10991 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        int blank = N-1;
        int star = N-blank;

        for(int i=0; i<N; i++) {
            for(int j=0; j<blank; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<star; j++) {
                System.out.print("*");
                if(j == star-1) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
            blank--;
            star++;
        }
    }
}
