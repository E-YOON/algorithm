// 3n+1 수열

import java.util.Scanner;

public class b14920 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 1;
        scan.close();

        while(true) {
            if(n == 1) break;

            if(n % 2 == 0) {
                n = n / 2;
                count++;

            } else if(n % 2 != 0) {
                n = 3 * n + 1;
                count++;
            }
        }

        System.out.println(count);
    }
}
