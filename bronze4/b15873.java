import java.util.Scanner;

public class b15873 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        scan.close();

        if(A == 1010) {
            System.out.println("20");
        } else if(A%10 == 0) {
            System.out.println((A/100) + 10);
        } else if(A/10 == 10) {
            System.out.println(10 + (A%10));
        } else {
            System.out.println((A/10) + (A%10));
        }
    }
}
