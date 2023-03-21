package bronze5;

import java.util.Scanner;

public class b27219 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        while(n > 0) {
            if(n >= 5) {
                System.out.print("V");
                n -= 5;
            } else if(n >= 1) {
                System.out.print("I");
                n -= 1;
            }
        }
    }
}
