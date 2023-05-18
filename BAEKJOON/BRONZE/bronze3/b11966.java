// 2의 제곱인가?

import java.util.Scanner;

public class b11966 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        while(N != 1) {
            if(N % 2 == 1) {
                System.out.println(0);
                return;
            }
            N /= 2;
        }
        System.out.println(1);
    }
}
