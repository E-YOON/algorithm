// 첼시를 도와줘!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11098 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            int p = Integer.parseInt(br.readLine());
            String answer = "";
            int max = 0;

            for(int j=0; j<p; j++) {
                st = new StringTokenizer(br.readLine());
                int C = Integer.parseInt(st.nextToken());
                String name = st.nextToken();

                if(max < C) {
                    answer = name;
                    max = C;
                }
            }

            System.out.println(answer);
        }
    }
}
