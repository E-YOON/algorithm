package bronze5;

import java.util.Scanner;

public class b5341 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int n = scan.nextInt();
            int block = 0;

            if(n==0)    break;
            
            block = pyramid(n);

            System.out.println(block);
        }
        scan.close();
    }

    public static int pyramid(int num) {
            if(num == 1) return 1;
        return  pyramid(num-1) + num;
    }
}
