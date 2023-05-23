// 아이들은 사탕을 좋아해

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b9550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int count = 0;

            for(int j=0; j<N; j++) {
                int num = Integer.parseInt(st.nextToken());
                count += num / K;
            }

            System.out.println(count);
        }
    }
}
