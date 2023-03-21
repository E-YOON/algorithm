import java.util.Scanner;

public class b15700 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long M = scan.nextLong();
        scan.close();

        System.out.println(N*M/2);
    }
}
