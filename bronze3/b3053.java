import java.util.Scanner;

public class b3053 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double R = scan.nextDouble();
        scan.close();
        
        System.out.println(R * R * Math.PI);
        System.out.println(2 * (R*R));
    }
}
