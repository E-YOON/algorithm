import java.util.Scanner;

public class b14470 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();     //원래 고기 온도
        int B = scan.nextInt();     //목표 온도
        int C = scan.nextInt();     //언 고기를 데우는 데 걸리는 시간
        int D = scan.nextInt();     //언 고기를 해동하는 데 걸리는 시간
        int E = scan.nextInt();     //얼어있지 않은 고기를 데우는 데 걸리는 시간
        scan.close();

        if(A < 0) {     //얼어있는 고기
            System.out.println((C * Math.abs(A)) + D + (B*E));
        } else if(A > 0) {
            System.out.println((B - A)*E);
        }
    }
}
