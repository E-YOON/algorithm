import java.util.Scanner;

public class b15921 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        if(N == 0) 
            System.out.println("divide by zero");
        else   
            System.out.println("1.00");
    }
}
