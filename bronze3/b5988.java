import java.util.Scanner;

public class b5988 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i=0; i<N; i++) {
            String str = scan.next();
            if((str.charAt(str.length()-1))%2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
        }
        scan.close();
    }
}
