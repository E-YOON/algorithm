// 수도요금

import java.util.Scanner;

public class b10707 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int P = scan.nextInt();
        scan.close();
        int xBill = A * P;
        int yBill = B;

        if(P > C) {
            int add = (P - C) * D;
            yBill += add;
        }

        System.out.println(xBill > yBill ? yBill : xBill);
    }
}
