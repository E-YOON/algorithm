import java.util.Scanner;

public class b5565 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumPrize = scan.nextInt();
        int sum = 0;
        for(int i=0; i<9; i++) {
            sum += scan.nextInt();
        }
        scan.close();

        System.out.println(sumPrize - sum);
    }
}
