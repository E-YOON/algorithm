// 멀티탭 충분하니?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b15780 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int count = 0;
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if(num % 2 == 0) {
                count += num/2;
            } else {
                count += num/2 + 1;
            }
        }
        System.out.println(N <= count ? "YES" : "NO");
    }
}
