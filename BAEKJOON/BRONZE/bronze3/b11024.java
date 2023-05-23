// 더하기 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            while(st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }
            System.out.println(sum);
        }
    }
}
