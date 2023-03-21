
import java.util.Arrays;
import java.util.Scanner;

public class b2783 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();   // Y그램 당 X원
        int Y = scan.nextInt();
        int N = scan.nextInt();    // 세븐25를 제외한 편의점의 개수
        double[] arr = new double[N+1];
        arr[0] = (double)X/Y;
        
        for(int i=0; i<N; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            arr[i+1] = (double)x/y;
        }

        scan.close();

        Arrays.sort(arr);
        System.out.println(arr[0] * 1000);
    }
}
