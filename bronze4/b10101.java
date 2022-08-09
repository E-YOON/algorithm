import java.util.Scanner;

public class b10101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        scan.close();

        int sum = x + y + z;

        if(sum == 180) {
            if(x == 60 && y == 60 && z == 60) {
                System.out.println("Equilateral");
            } else if(x == y || x == z || z == y) {
                System.out.println("Isosceles");
            } else if(x != y && x != z && z != y) {
                System.out.println("Scalene");
            } 
        } else {
            System.out.println("Error");
        }
    }
}
