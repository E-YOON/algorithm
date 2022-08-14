import java.util.Scanner;

public class b15726 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextInt();
        double B = scan.nextInt();
        double C = scan.nextInt();
        scan.close();

        int x = (int)(A * B / C);
        int y = (int)(A / B * C);

        if(x>y) System.out.println(x);
        else System.out.println(y);
    }
}
