// 아이 러브 크로아티아

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b9517 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int now = 0;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            String Z = st.nextToken();

            if(now + T > 210) break;

            if(Z.equals("T")) {
                if(++K > 8) {
                    K = 1;
                }
            }

            now += T;
        }

        System.out.println(K);
    }
}
