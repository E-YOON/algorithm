import java.util.Scanner;

public class b10768 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int d = scan.nextInt();
        scan.close();

        if(m < 2) {
            System.out.println("Before");
        } else if(m == 2) {
            if(d < 18) {
                System.out.println("Before");
            } else if(d > 18) {
                System.out.println("After");
            } else {
                System.out.println("Special");
            }
        } else {
            System.out.println("After");
        }
    }
}
