import java.math.BigInteger;
import java.util.Scanner;

public class b2935 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger A = new BigInteger(scan.nextLine());
        String operator = scan.nextLine();
        BigInteger B = new BigInteger(scan.nextLine());
        scan.close();

        if(operator.equals("+")) {
            System.out.println(A.add(B));
        } else {
            System.out.println(A.multiply(B));
        }
    }
}
