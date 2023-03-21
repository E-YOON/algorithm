import java.util.Scanner;

public class b11282 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();

        x += 44031;

        System.out.println((char)x);
    }
}
