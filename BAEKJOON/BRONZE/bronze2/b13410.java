// 거꾸로 구구단

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b13410 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int max = 0;

        for(int i=1; i<=K; i++) {
            int multy = N*i;
            StringBuffer sb = new StringBuffer(String.valueOf(multy));
            String reverse = sb.reverse().toString();

            if(max < Integer.parseInt(reverse)) {
                max = Integer.parseInt(reverse);
            }
        }

        System.out.println(max);
    }
}
