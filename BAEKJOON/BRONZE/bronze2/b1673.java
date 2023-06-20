// 치킨 쿠폰 ~ing

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1673 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        while(true) {
            String str = br.readLine();
            if(str == null) {
                break;
            }

            st = new StringTokenizer(str);
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int chicken = 0;
            chicken += n;
            while(n >= k) {
                n = n/k;
                chicken += n;
            }

            System.out.println(chicken);
        }

    }
}
