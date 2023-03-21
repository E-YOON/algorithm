package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class b24309 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.nextLine());
        BigInteger b = new BigInteger(scan.nextLine());
        BigInteger c = new BigInteger(scan.nextLine());
        scan.close();

        System.out.println((b.subtract(c)).divide(a));
    }
}
