// 베시와 데이지

import java.util.Scanner;

public class b16431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Bx = sc.nextInt(), By = sc.nextInt();
        int Dx = sc.nextInt(), Dy = sc.nextInt();
        int Jx = sc.nextInt(), Jy = sc.nextInt();
        sc.close();
        
        int b = Math.max(Math.abs(Jx-Bx), Math.abs(Jy-By));
        int d = Math.abs(Jx-Dx) + Math.abs(Jy-Dy);

        if(b == d) {
            System.out.println("tie");
        } else if(b < d) {
            System.out.println("bessie");
        } else {
            System.out.println("daisy");
        }
    }
}