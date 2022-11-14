import java.util.Scanner;

public class b4504 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while(true) {
            int x = scan.nextInt();
            if(x == 0)  break;

            if(x%n == 0) {
                System.out.println(x + " is a multiple of " + n + ".");
            } else {
                System.out.println(x + " is NOT a multiple of " + n + ".");
            }
        }

        scan.close();
    }
}
