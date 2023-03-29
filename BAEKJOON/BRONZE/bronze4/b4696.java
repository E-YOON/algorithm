import java.util.Scanner;

public class b4696 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double answer = 0.0;

        while(true) {
            double d = scan.nextDouble();

            if(d == 0.0) break;

            answer = Math.pow(d, 1) + Math.pow(d, 2) + Math.pow(d, 3) + Math.pow(d, 4) + 1;
            System.out.printf("%.2f%n", answer);
        }
        scan.close();
    }
    
}