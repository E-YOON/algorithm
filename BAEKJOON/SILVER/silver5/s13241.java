// 최소공배수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        System.out.println(lcm(A, B));
    }

    public static long gcd(long A, long B) {
        while(B > 0) {
            long temp = A;
            A = B;
            B = temp % B;
        }

        return A;
    }

    public static long lcm(long A, long B) {
        return (A*B) / gcd(A, B);
    }
}
