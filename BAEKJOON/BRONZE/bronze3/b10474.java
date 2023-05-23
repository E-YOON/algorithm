// 분수좋아해?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10474 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            if(m==0 && d==0) break;

            System.out.println((m/d) + " " + (m%d) + " / " + d);
        }
    }
}
