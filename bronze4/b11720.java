import java.util.Scanner;

public class b11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str = scan.next();
        scan.close();

        int sum = 0;

        for(int i=0; i<N; i++) {
            sum += str.charAt(i)-'0'; 
        }

        System.out.println(sum);
    }
}
