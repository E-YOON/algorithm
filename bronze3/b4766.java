import java.util.Scanner;

public class b4766 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();

        while(true) {
            
            double y = scan.nextDouble();

            if((int)y == 999) break;

            double z = y-x;

            System.out.printf("%.2f%n", z);

            x = y;
        }
        scan.close();
    }
}
