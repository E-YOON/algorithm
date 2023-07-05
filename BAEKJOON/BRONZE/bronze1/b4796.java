// 캠핑

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int index = 1;

        while(true) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            
            if(L==0 && P==0 && V==0) break;

            int answer = 0;
            answer += (V / P) * L;
            answer += Math.min(V % P, L);

            System.out.println("Case " + index + ": " + answer);

            index++;
        }
    }
}
