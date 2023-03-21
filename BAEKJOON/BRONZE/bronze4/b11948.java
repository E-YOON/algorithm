import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class b11948 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer a[] = new Integer[4];
        int b[] = new int[2];
        for(int i=0; i<a.length; i++) {
            a[i] = scan.nextInt();
        }
        for(int i=0; i<b.length; i++) {
            b[i] = scan.nextInt();
        }
        scan.close();

        Arrays.sort(a, Collections.reverseOrder());
        int sum = 0;
        for(int i=0; i<3; i++) {
            sum += a[i];
        }
        sum += Math.max(b[0], b[1]);

        System.out.println(sum);
    }
}
