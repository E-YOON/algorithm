// 2018 연세대학교 프로그래밍 경진대회

import java.util.Scanner;

public class b15667 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        int K = 1;
        while((K * K) + 1 <= N) {
            K++;
        }
        System.out.println(K-1);
    }
}
