import java.util.Scanner;

public class b14623 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String B1 = scan.nextLine();
        String B2 = scan.nextLine();
        scan.close();

        long decimalB1 = Long.parseLong(B1, 2);
        long decimalB2 = Long.parseLong(B2, 2);

        long X = decimalB1 * decimalB2;

        String binaryX = Long.toBinaryString(X);

        System.out.println(binaryX);
    }
}