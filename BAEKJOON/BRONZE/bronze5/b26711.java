package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class b26711 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger A = new BigInteger(scan.nextLine());
        BigInteger B = new BigInteger(scan.nextLine());
        scan.close();
        System.out.println(A.add(B));
    }
}
