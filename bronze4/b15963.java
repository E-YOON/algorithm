import java.util.Scanner;

public class b15963 {
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long M = scan.nextLong();
        scan.close();

        if(N == M)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
