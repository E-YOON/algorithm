import java.util.Scanner;

public class b14924 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();     //기차의 속도
        int T = scan.nextInt();     //파리의 속도
        int D = scan.nextInt();     //두 기차 사이의 거리
        scan.close();

        int x = D/(S*2);
        System.out.println(x*T);

    }
}
