// 초6 수학

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int a = Math.max(x, y);
            int b = Math.min(x, y);
            int num = gcd(a, b);
            System.out.println((a*b / num) + " " + num);
        }
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a%b);
    }
}
