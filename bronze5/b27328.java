package bronze5;

import java.util.Scanner;

public class b27328 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        scan.close();
        if(A < B) {
            System.out.println("-1");
        } else if(A == B) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}
