// 벌집

import java.util.Scanner;

public class b2292 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        int count = 1;
        int range = 2;

        if(N == 1) {
            System.out.println(1);
        
        } else {
            while(range <= N) {
                range += 6 * count;
                count++;
            }
            System.out.println(count);
        }
    }
}
