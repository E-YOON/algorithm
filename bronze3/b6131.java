import java.util.Scanner;

public class b6131 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        int cnt = 0;

        for(int i=1; i<501; i++) {
            double A = Math.pow(i, 2);
            for(int j=1; j<501; j++) {
                double B = Math.pow(j, 2);

                if(A == B+N) cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}
